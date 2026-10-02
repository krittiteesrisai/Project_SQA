package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.jscomp.GlobalNamespace.Name;
import java.util.ArrayList;
import java.util.HashMap;
import com.google.javascript.rhino.Node;
import java.util.List;
import java.util.Map;
import java.lang.reflect.Constructor;
import com.google.javascript.rhino.jstype.StaticScope;
import java.util.LinkedHashMap;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.JSType;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import com.google.javascript.jscomp.GlobalNamespace.AstChange;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.Scope.Arguments;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public final class com_google_javascript_jscomp_GlobalNamespaceTest {
    ///region Test suites for executable com.google.javascript.jscomp.GlobalNamespace.getScope
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getScope(com.google.javascript.jscomp.GlobalNamespace$Name)
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#getScope(com.google.javascript.jscomp.GlobalNamespace.Name)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testGetScope_Return() throws Exception  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        
        GlobalNamespace actual = ((GlobalNamespace) globalNamespace.getScope(((GlobalNamespace.Name) null)));
        
        GlobalNamespace expected = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        ArrayList globalNames = new ArrayList();
        setField(expected, "com.google.javascript.jscomp.GlobalNamespace", "globalNames", globalNames);
        HashMap nameMap = new HashMap();
        setField(expected, "com.google.javascript.jscomp.GlobalNamespace", "nameMap", nameMap);
        
        AbstractCompiler actualCompiler = ((AbstractCompiler) getFieldValue(actual, "com.google.javascript.jscomp.GlobalNamespace", "compiler"));
        assertNull(actualCompiler);
        
        Node actualRoot = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.GlobalNamespace", "root"));
        assertNull(actualRoot);
        
        Node actualExternsRoot = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot"));
        assertNull(actualExternsRoot);
        
        boolean actualInExterns = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.GlobalNamespace", "inExterns"));
        assertFalse(actualInExterns);
        
        Scope actualExternsScope = ((Scope) getFieldValue(actual, "com.google.javascript.jscomp.GlobalNamespace", "externsScope"));
        assertNull(actualExternsScope);
        
        boolean actualGenerated = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.GlobalNamespace", "generated"));
        assertFalse(actualGenerated);
        
        int expectedCurrentPreOrderIndex = ((Integer) getFieldValue(expected, "com.google.javascript.jscomp.GlobalNamespace", "currentPreOrderIndex"));
        int actualCurrentPreOrderIndex = ((Integer) getFieldValue(actual, "com.google.javascript.jscomp.GlobalNamespace", "currentPreOrderIndex"));
        assertEquals(expectedCurrentPreOrderIndex, actualCurrentPreOrderIndex);
        
        List expectedGlobalNames = ((List) getFieldValue(expected, "com.google.javascript.jscomp.GlobalNamespace", "globalNames"));
        List actualGlobalNames = ((List) getFieldValue(actual, "com.google.javascript.jscomp.GlobalNamespace", "globalNames"));
        assertTrue(deepEquals(expectedGlobalNames, actualGlobalNames));
        
        Map expectedNameMap = ((Map) getFieldValue(expected, "com.google.javascript.jscomp.GlobalNamespace", "nameMap"));
        Map actualNameMap = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.GlobalNamespace", "nameMap"));
        assertTrue(deepEquals(expectedNameMap, actualNameMap));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.GlobalNamespace.getRootNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRootNode()
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#getRootNode()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.returnsFrom {@code return root.getParent();}
 *  */
    @Test
    public void testGetRootNode_NodeGetParent() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class abstractCompilerType = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Constructor globalNamespaceConstructor = globalNamespaceClazz.getDeclaredConstructor(abstractCompilerType, nodeType, nodeType);
        globalNamespaceConstructor.setAccessible(true);
        java.lang.Object[] globalNamespaceConstructorArguments = new java.lang.Object[3];
        globalNamespaceConstructorArguments[0] = ((Object) null);
        globalNamespaceConstructorArguments[1] = ((Object) null);
        globalNamespaceConstructorArguments[2] = numberNode;
        GlobalNamespace globalNamespace = ((GlobalNamespace) globalNamespaceConstructor.newInstance(globalNamespaceConstructorArguments));
        
        Node actual = globalNamespace.getRootNode();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRootNode()
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#getRootNode()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return root.getParent();
 *  */
    @Test
    public void testGetRootNode_ThrowNullPointerException() {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null, null);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.getRootNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.GlobalNamespace.getRootNode(GlobalNamespace.java:109) */
        globalNamespace.getRootNode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.GlobalNamespace.getParentScope
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getParentScope()
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#getParentScope()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetParentScope_ReturnNull() {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        
        StaticScope actual = globalNamespace.getParentScope();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.GlobalNamespace.hasExternsRoot
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasExternsRoot()
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#hasExternsRoot()}
 * @utbot.returnsFrom {@code return externsRoot != null;}
 *  */
    @Test
    public void testHasExternsRoot_ExternsRootNotEqualsNull() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class abstractCompilerType = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Constructor globalNamespaceConstructor = globalNamespaceClazz.getDeclaredConstructor(abstractCompilerType, numberNodeType, numberNodeType);
        globalNamespaceConstructor.setAccessible(true);
        java.lang.Object[] globalNamespaceConstructorArguments = new java.lang.Object[3];
        globalNamespaceConstructorArguments[0] = ((Object) null);
        globalNamespaceConstructorArguments[1] = numberNode;
        globalNamespaceConstructorArguments[2] = ((Object) null);
        GlobalNamespace globalNamespace = ((GlobalNamespace) globalNamespaceConstructor.newInstance(globalNamespaceConstructorArguments));
        
        boolean actual = globalNamespace.hasExternsRoot();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#hasExternsRoot()}
 * @utbot.returnsFrom {@code return externsRoot != null;}
 *  */
    @Test
    public void testHasExternsRoot_ExternsRootEqualsNull() {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null, null);
        
        boolean actual = globalNamespace.hasExternsRoot();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.GlobalNamespace.getOwnSlot
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOwnSlot(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#getOwnSlot(java.lang.String)}
 * @utbot.invokes com.google.javascript.jscomp.GlobalNamespace#ensureGenerated()
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return nameMap.get(name);}
 *  */
    @Test
    public void testGetOwnSlot_MapGet() throws Exception  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "generated", true);
        LinkedHashMap nameMap = new LinkedHashMap();
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "nameMap", nameMap);
        String string = "";
        
        GlobalNamespace.Name actual = globalNamespace.getOwnSlot(string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getOwnSlot(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#getOwnSlot(java.lang.String)}
 * @utbot.invokes com.google.javascript.jscomp.GlobalNamespace#ensureGenerated()
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return nameMap.get(name);
 *  */
    @Test
    public void testGetOwnSlot_ThrowNullPointerException() throws Exception  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "generated", true);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.getOwnSlot] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.GlobalNamespace.getOwnSlot(GlobalNamespace.java:125) */
        globalNamespace.getOwnSlot(((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.GlobalNamespace.getTypeOfThis
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTypeOfThis()
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#getTypeOfThis()}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getTypeRegistry()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return compiler.getTypeRegistry().getNativeObjectType(GLOBAL_THIS);
 *  */
    @Test
    public void testGetTypeOfThis_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "typeRegistry", typeRegistry);
        GlobalNamespace globalNamespace = new GlobalNamespace(compiler, null, null);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.getTypeOfThis] produces [java.lang.ArrayIndexOutOfBoundsException: Index 46 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:904)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:908)
            com.google.javascript.jscomp.GlobalNamespace.getTypeOfThis(GlobalNamespace.java:130) */
        globalNamespace.getTypeOfThis();
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#getTypeOfThis()}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getTypeRegistry()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return compiler.getTypeRegistry().getNativeObjectType(GLOBAL_THIS);
 *  */
    @Test
    public void testGetTypeOfThis_ThrowNullPointerException() {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null, null);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.getTypeOfThis] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.GlobalNamespace.getTypeOfThis(GlobalNamespace.java:130) */
        globalNamespace.getTypeOfThis();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.GlobalNamespace.scanFromNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method scanFromNode(com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace, com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.Scope, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#scanFromNode(com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace,com.google.javascript.jscomp.JSModule,com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testScanFromNode_2() throws Exception  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        Object buildGlobalNamespace = createInstance("com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace");
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(147);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class buildGlobalNamespaceType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanFromNodeMethod = globalNamespaceClazz.getDeclaredMethod("scanFromNode", buildGlobalNamespaceType, jSModuleType, scopeType, numberNodeType);
        scanFromNodeMethod.setAccessible(true);
        java.lang.Object[] scanFromNodeMethodArguments = new java.lang.Object[4];
        scanFromNodeMethodArguments[0] = buildGlobalNamespace;
        scanFromNodeMethodArguments[1] = ((Object) null);
        scanFromNodeMethodArguments[2] = ((Object) null);
        scanFromNodeMethodArguments[3] = numberNode;
        scanFromNodeMethod.invoke(globalNamespace, scanFromNodeMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#scanFromNode(com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace,com.google.javascript.jscomp.JSModule,com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testScanFromNode() throws Exception  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        Object buildGlobalNamespace = createInstance("com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace");
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(-255);
        
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class buildGlobalNamespaceType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanFromNodeMethod = globalNamespaceClazz.getDeclaredMethod("scanFromNode", buildGlobalNamespaceType, jSModuleType, scopeType, nodeType);
        scanFromNodeMethod.setAccessible(true);
        java.lang.Object[] scanFromNodeMethodArguments = new java.lang.Object[4];
        scanFromNodeMethodArguments[0] = buildGlobalNamespace;
        scanFromNodeMethodArguments[1] = ((Object) null);
        scanFromNodeMethodArguments[2] = ((Object) null);
        scanFromNodeMethodArguments[3] = node;
        scanFromNodeMethod.invoke(globalNamespace, scanFromNodeMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#scanFromNode(com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace,com.google.javascript.jscomp.JSModule,com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testScanFromNode_1() throws Exception  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        Object buildGlobalNamespace = createInstance("com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace");
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(154);
        
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class buildGlobalNamespaceType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanFromNodeMethod = globalNamespaceClazz.getDeclaredMethod("scanFromNode", buildGlobalNamespaceType, jSModuleType, scopeType, nodeType);
        scanFromNodeMethod.setAccessible(true);
        java.lang.Object[] scanFromNodeMethodArguments = new java.lang.Object[4];
        scanFromNodeMethodArguments[0] = buildGlobalNamespace;
        scanFromNodeMethodArguments[1] = ((Object) null);
        scanFromNodeMethodArguments[2] = ((Object) null);
        scanFromNodeMethodArguments[3] = node;
        scanFromNodeMethod.invoke(globalNamespace, scanFromNodeMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#scanFromNode(com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace,com.google.javascript.jscomp.JSModule,com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testScanFromNode_3() throws Exception  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        Object buildGlobalNamespace = createInstance("com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace");
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(148);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(64);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class buildGlobalNamespaceType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanFromNodeMethod = globalNamespaceClazz.getDeclaredMethod("scanFromNode", buildGlobalNamespaceType, jSModuleType, scopeType, nodeType);
        scanFromNodeMethod.setAccessible(true);
        java.lang.Object[] scanFromNodeMethodArguments = new java.lang.Object[4];
        scanFromNodeMethodArguments[0] = buildGlobalNamespace;
        scanFromNodeMethodArguments[1] = ((Object) null);
        scanFromNodeMethodArguments[2] = ((Object) null);
        scanFromNodeMethodArguments[3] = node;
        scanFromNodeMethod.invoke(globalNamespace, scanFromNodeMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#scanFromNode(com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace,com.google.javascript.jscomp.JSModule,com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testScanFromNode_9() throws Exception  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        Object buildGlobalNamespace = createInstance("com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace");
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(148);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(64);
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent1.setType(38);
        Node parent2 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent2.setType(-255);
        setField(parent1, "com.google.javascript.rhino.Node", "parent", parent2);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class buildGlobalNamespaceType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanFromNodeMethod = globalNamespaceClazz.getDeclaredMethod("scanFromNode", buildGlobalNamespaceType, jSModuleType, scopeType, nodeType);
        scanFromNodeMethod.setAccessible(true);
        java.lang.Object[] scanFromNodeMethodArguments = new java.lang.Object[4];
        scanFromNodeMethodArguments[0] = buildGlobalNamespace;
        scanFromNodeMethodArguments[1] = ((Object) null);
        scanFromNodeMethodArguments[2] = ((Object) null);
        scanFromNodeMethodArguments[3] = node;
        scanFromNodeMethod.invoke(globalNamespace, scanFromNodeMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#scanFromNode(com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace,com.google.javascript.jscomp.JSModule,com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testScanFromNode_13() throws Exception  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        Object buildGlobalNamespace = createInstance("com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace");
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(148);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(64);
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent1.setType(154);
        Node parent2 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent1, "com.google.javascript.rhino.Node", "parent", parent2);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class buildGlobalNamespaceType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanFromNodeMethod = globalNamespaceClazz.getDeclaredMethod("scanFromNode", buildGlobalNamespaceType, jSModuleType, scopeType, nodeType);
        scanFromNodeMethod.setAccessible(true);
        java.lang.Object[] scanFromNodeMethodArguments = new java.lang.Object[4];
        scanFromNodeMethodArguments[0] = buildGlobalNamespace;
        scanFromNodeMethodArguments[1] = ((Object) null);
        scanFromNodeMethodArguments[2] = ((Object) null);
        scanFromNodeMethodArguments[3] = node;
        scanFromNodeMethod.invoke(globalNamespace, scanFromNodeMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#scanFromNode(com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace,com.google.javascript.jscomp.JSModule,com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testScanFromNode_4() throws Exception  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        Object buildGlobalNamespace = createInstance("com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace");
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(148);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(64);
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent1.setType(154);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class buildGlobalNamespaceType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanFromNodeMethod = globalNamespaceClazz.getDeclaredMethod("scanFromNode", buildGlobalNamespaceType, jSModuleType, scopeType, nodeType);
        scanFromNodeMethod.setAccessible(true);
        java.lang.Object[] scanFromNodeMethodArguments = new java.lang.Object[4];
        scanFromNodeMethodArguments[0] = buildGlobalNamespace;
        scanFromNodeMethodArguments[1] = ((Object) null);
        scanFromNodeMethodArguments[2] = ((Object) null);
        scanFromNodeMethodArguments[3] = node;
        scanFromNodeMethod.invoke(globalNamespace, scanFromNodeMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#scanFromNode(com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace,com.google.javascript.jscomp.JSModule,com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testScanFromNode_5() throws Exception  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        Object buildGlobalNamespace = createInstance("com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace");
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(148);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(64);
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent1.setType(-255);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class buildGlobalNamespaceType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanFromNodeMethod = globalNamespaceClazz.getDeclaredMethod("scanFromNode", buildGlobalNamespaceType, jSModuleType, scopeType, nodeType);
        scanFromNodeMethod.setAccessible(true);
        java.lang.Object[] scanFromNodeMethodArguments = new java.lang.Object[4];
        scanFromNodeMethodArguments[0] = buildGlobalNamespace;
        scanFromNodeMethodArguments[1] = ((Object) null);
        scanFromNodeMethodArguments[2] = ((Object) null);
        scanFromNodeMethodArguments[3] = node;
        scanFromNodeMethod.invoke(globalNamespace, scanFromNodeMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#scanFromNode(com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace,com.google.javascript.jscomp.JSModule,com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testScanFromNode_6() throws Exception  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        Object buildGlobalNamespace = createInstance("com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace");
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(148);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(64);
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent1.setType(38);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class buildGlobalNamespaceType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanFromNodeMethod = globalNamespaceClazz.getDeclaredMethod("scanFromNode", buildGlobalNamespaceType, jSModuleType, scopeType, nodeType);
        scanFromNodeMethod.setAccessible(true);
        java.lang.Object[] scanFromNodeMethodArguments = new java.lang.Object[4];
        scanFromNodeMethodArguments[0] = buildGlobalNamespace;
        scanFromNodeMethodArguments[1] = ((Object) null);
        scanFromNodeMethodArguments[2] = ((Object) null);
        scanFromNodeMethodArguments[3] = node;
        scanFromNodeMethod.invoke(globalNamespace, scanFromNodeMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#scanFromNode(com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace,com.google.javascript.jscomp.JSModule,com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testScanFromNode_7() throws Exception  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        Object buildGlobalNamespace = createInstance("com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace");
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(148);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(64);
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent1.setType(86);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(parent1, "com.google.javascript.rhino.Node", "first", first);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class buildGlobalNamespaceType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanFromNodeMethod = globalNamespaceClazz.getDeclaredMethod("scanFromNode", buildGlobalNamespaceType, jSModuleType, scopeType, nodeType);
        scanFromNodeMethod.setAccessible(true);
        java.lang.Object[] scanFromNodeMethodArguments = new java.lang.Object[4];
        scanFromNodeMethodArguments[0] = buildGlobalNamespace;
        scanFromNodeMethodArguments[1] = ((Object) null);
        scanFromNodeMethodArguments[2] = ((Object) null);
        scanFromNodeMethodArguments[3] = node;
        scanFromNodeMethod.invoke(globalNamespace, scanFromNodeMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#scanFromNode(com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace,com.google.javascript.jscomp.JSModule,com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testScanFromNode_12() throws Exception  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        Object buildGlobalNamespace = createInstance("com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace");
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(148);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(64);
        Object parent1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent1)).setType(38);
        Node parent2 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent2.setType(118);
        setField(parent1, "com.google.javascript.rhino.Node", "parent", parent2);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class buildGlobalNamespaceType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanFromNodeMethod = globalNamespaceClazz.getDeclaredMethod("scanFromNode", buildGlobalNamespaceType, jSModuleType, scopeType, nodeType);
        scanFromNodeMethod.setAccessible(true);
        java.lang.Object[] scanFromNodeMethodArguments = new java.lang.Object[4];
        scanFromNodeMethodArguments[0] = buildGlobalNamespace;
        scanFromNodeMethodArguments[1] = ((Object) null);
        scanFromNodeMethodArguments[2] = ((Object) null);
        scanFromNodeMethodArguments[3] = node;
        scanFromNodeMethod.invoke(globalNamespace, scanFromNodeMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#scanFromNode(com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace,com.google.javascript.jscomp.JSModule,com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testScanFromNode_8() throws Exception  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        Object buildGlobalNamespace = createInstance("com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace");
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(148);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(64);
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent1.setType(86);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(parent1, "com.google.javascript.rhino.Node", "first", first);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class buildGlobalNamespaceType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanFromNodeMethod = globalNamespaceClazz.getDeclaredMethod("scanFromNode", buildGlobalNamespaceType, jSModuleType, scopeType, nodeType);
        scanFromNodeMethod.setAccessible(true);
        java.lang.Object[] scanFromNodeMethodArguments = new java.lang.Object[4];
        scanFromNodeMethodArguments[0] = buildGlobalNamespace;
        scanFromNodeMethodArguments[1] = ((Object) null);
        scanFromNodeMethodArguments[2] = ((Object) null);
        scanFromNodeMethodArguments[3] = node;
        scanFromNodeMethod.invoke(globalNamespace, scanFromNodeMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#scanFromNode(com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace,com.google.javascript.jscomp.JSModule,com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testScanFromNode_10() throws Exception  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        Object buildGlobalNamespace = createInstance("com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace");
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(148);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(64);
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent1.setType(86);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        setField(parent1, "com.google.javascript.rhino.Node", "first", first);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class buildGlobalNamespaceType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanFromNodeMethod = globalNamespaceClazz.getDeclaredMethod("scanFromNode", buildGlobalNamespaceType, jSModuleType, scopeType, nodeType);
        scanFromNodeMethod.setAccessible(true);
        java.lang.Object[] scanFromNodeMethodArguments = new java.lang.Object[4];
        scanFromNodeMethodArguments[0] = buildGlobalNamespace;
        scanFromNodeMethodArguments[1] = ((Object) null);
        scanFromNodeMethodArguments[2] = ((Object) null);
        scanFromNodeMethodArguments[3] = node;
        scanFromNodeMethod.invoke(globalNamespace, scanFromNodeMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#scanFromNode(com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace,com.google.javascript.jscomp.JSModule,com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testScanFromNode_11() throws Exception  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        Object buildGlobalNamespace = createInstance("com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace");
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(148);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(64);
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent1.setType(86);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(42);
        setField(parent1, "com.google.javascript.rhino.Node", "first", first);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class buildGlobalNamespaceType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanFromNodeMethod = globalNamespaceClazz.getDeclaredMethod("scanFromNode", buildGlobalNamespaceType, jSModuleType, scopeType, stringNodeType);
        scanFromNodeMethod.setAccessible(true);
        java.lang.Object[] scanFromNodeMethodArguments = new java.lang.Object[4];
        scanFromNodeMethodArguments[0] = buildGlobalNamespace;
        scanFromNodeMethodArguments[1] = ((Object) null);
        scanFromNodeMethodArguments[2] = ((Object) null);
        scanFromNodeMethodArguments[3] = stringNode;
        scanFromNodeMethod.invoke(globalNamespace, scanFromNodeMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method scanFromNode(com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace, com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.Scope, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#scanFromNode(com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace,com.google.javascript.jscomp.JSModule,com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.isName() || n.isGetProp()
 *  */
    @Test
    public void testScanFromNode_ThrowNullPointerException() throws Throwable  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.scanFromNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.GlobalNamespace.scanFromNode(GlobalNamespace.java:209) */
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class buildGlobalNamespaceType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanFromNodeMethod = globalNamespaceClazz.getDeclaredMethod("scanFromNode", buildGlobalNamespaceType, jSModuleType, scopeType, nodeType);
        scanFromNodeMethod.setAccessible(true);
        java.lang.Object[] scanFromNodeMethodArguments = new java.lang.Object[4];
        scanFromNodeMethodArguments[0] = ((Object) null);
        scanFromNodeMethodArguments[1] = ((Object) null);
        scanFromNodeMethodArguments[2] = ((Object) null);
        scanFromNodeMethodArguments[3] = ((Object) null);
        try {
            scanFromNodeMethod.invoke(globalNamespace, scanFromNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#scanFromNode(com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace,com.google.javascript.jscomp.JSModule,com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.isName() || n.isGetProp()): True}
 * @utbot.executesCondition {@code (if (n.isName() || n.isGetProp()) {
 *     scanFromNode(builder, module, scope, n.getParent());
 * }): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace#collect(com.google.javascript.jscomp.JSModule,com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: builder.collect(module, scope, n);
 *  */
    @Test
    public void testScanFromNode_ThrowNullPointerException_1() throws Throwable  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        Node node = new Node(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.scanFromNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.GlobalNamespace.scanFromNode(GlobalNamespace.java:212) */
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class buildGlobalNamespaceType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanFromNodeMethod = globalNamespaceClazz.getDeclaredMethod("scanFromNode", buildGlobalNamespaceType, jSModuleType, scopeType, nodeType);
        scanFromNodeMethod.setAccessible(true);
        java.lang.Object[] scanFromNodeMethodArguments = new java.lang.Object[4];
        scanFromNodeMethodArguments[0] = ((Object) null);
        scanFromNodeMethodArguments[1] = ((Object) null);
        scanFromNodeMethodArguments[2] = ((Object) null);
        scanFromNodeMethodArguments[3] = node;
        try {
            scanFromNodeMethod.invoke(globalNamespace, scanFromNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#scanFromNode(com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace,com.google.javascript.jscomp.JSModule,com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.isName() || n.isGetProp()): True}
 * @utbot.executesCondition {@code (if (n.isName() || n.isGetProp()) {
 *     scanFromNode(builder, module, scope, n.getParent());
 * }): True}
 * @utbot.triggersRecursion scanFromNode
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scanFromNode(builder, module, scope, n.getParent());
 *  */
    @Test
    public void testScanFromNode_ThrowNullPointerException_2() throws Throwable  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.scanFromNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.GlobalNamespace.scanFromNode(GlobalNamespace.java:209)
            com.google.javascript.jscomp.GlobalNamespace.scanFromNode(GlobalNamespace.java:210) */
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class buildGlobalNamespaceType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanFromNodeMethod = globalNamespaceClazz.getDeclaredMethod("scanFromNode", buildGlobalNamespaceType, jSModuleType, scopeType, nodeType);
        scanFromNodeMethod.setAccessible(true);
        java.lang.Object[] scanFromNodeMethodArguments = new java.lang.Object[4];
        scanFromNodeMethodArguments[0] = ((Object) null);
        scanFromNodeMethodArguments[1] = ((Object) null);
        scanFromNodeMethodArguments[2] = ((Object) null);
        scanFromNodeMethodArguments[3] = node;
        try {
            scanFromNodeMethod.invoke(globalNamespace, scanFromNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#scanFromNode(com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace,com.google.javascript.jscomp.JSModule,com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.isName() || n.isGetProp()): False}
 * @utbot.triggersRecursion scanFromNode
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scanFromNode(builder, module, scope, n.getParent());
 *  */
    @Test
    public void testScanFromNode_ThrowNullPointerException_3() throws Throwable  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.scanFromNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.GlobalNamespace.scanFromNode(GlobalNamespace.java:209)
            com.google.javascript.jscomp.GlobalNamespace.scanFromNode(GlobalNamespace.java:210) */
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class buildGlobalNamespaceType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanFromNodeMethod = globalNamespaceClazz.getDeclaredMethod("scanFromNode", buildGlobalNamespaceType, jSModuleType, scopeType, nodeType);
        scanFromNodeMethod.setAccessible(true);
        java.lang.Object[] scanFromNodeMethodArguments = new java.lang.Object[4];
        scanFromNodeMethodArguments[0] = ((Object) null);
        scanFromNodeMethodArguments[1] = ((Object) null);
        scanFromNodeMethodArguments[2] = ((Object) null);
        scanFromNodeMethodArguments[3] = node;
        try {
            scanFromNodeMethod.invoke(globalNamespace, scanFromNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method scanFromNode(com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace, com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.Scope, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#scanFromNode(com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace,com.google.javascript.jscomp.JSModule,com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: builder.collect(module, scope, n);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testScanFromNode_ThrowUnsupportedOperationException_2() throws Throwable  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        Object buildGlobalNamespace = createInstance("com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace");
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(148);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(64);
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent1.setType(38);
        Node parent2 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent2.setType(118);
        setField(parent1, "com.google.javascript.rhino.Node", "parent", parent2);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class buildGlobalNamespaceType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanFromNodeMethod = globalNamespaceClazz.getDeclaredMethod("scanFromNode", buildGlobalNamespaceType, jSModuleType, scopeType, nodeType);
        scanFromNodeMethod.setAccessible(true);
        java.lang.Object[] scanFromNodeMethodArguments = new java.lang.Object[4];
        scanFromNodeMethodArguments[0] = buildGlobalNamespace;
        scanFromNodeMethodArguments[1] = ((Object) null);
        scanFromNodeMethodArguments[2] = ((Object) null);
        scanFromNodeMethodArguments[3] = node;
        try {
            scanFromNodeMethod.invoke(globalNamespace, scanFromNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#scanFromNode(com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace,com.google.javascript.jscomp.JSModule,com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: builder.collect(module, scope, n);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testScanFromNode_ThrowUnsupportedOperationException() throws Throwable  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        Object buildGlobalNamespace = createInstance("com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace");
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(148);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(64);
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent1.setType(86);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(parent1, "com.google.javascript.rhino.Node", "first", first);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class buildGlobalNamespaceType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanFromNodeMethod = globalNamespaceClazz.getDeclaredMethod("scanFromNode", buildGlobalNamespaceType, jSModuleType, scopeType, nodeType);
        scanFromNodeMethod.setAccessible(true);
        java.lang.Object[] scanFromNodeMethodArguments = new java.lang.Object[4];
        scanFromNodeMethodArguments[0] = buildGlobalNamespace;
        scanFromNodeMethodArguments[1] = ((Object) null);
        scanFromNodeMethodArguments[2] = ((Object) null);
        scanFromNodeMethodArguments[3] = node;
        try {
            scanFromNodeMethod.invoke(globalNamespace, scanFromNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#scanFromNode(com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace,com.google.javascript.jscomp.JSModule,com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: builder.collect(module, scope, n);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testScanFromNode_ThrowUnsupportedOperationException_1() throws Throwable  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        Object buildGlobalNamespace = createInstance("com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace");
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(148);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(64);
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent1.setType(86);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        setField(parent1, "com.google.javascript.rhino.Node", "first", first);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class buildGlobalNamespaceType = Class.forName("com.google.javascript.jscomp.GlobalNamespace$BuildGlobalNamespace");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanFromNodeMethod = globalNamespaceClazz.getDeclaredMethod("scanFromNode", buildGlobalNamespaceType, jSModuleType, scopeType, nodeType);
        scanFromNodeMethod.setAccessible(true);
        java.lang.Object[] scanFromNodeMethodArguments = new java.lang.Object[4];
        scanFromNodeMethodArguments[0] = buildGlobalNamespace;
        scanFromNodeMethodArguments[1] = ((Object) null);
        scanFromNodeMethodArguments[2] = ((Object) null);
        scanFromNodeMethodArguments[3] = node;
        try {
            scanFromNodeMethod.invoke(globalNamespace, scanFromNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
            com.google.javascript.jscomp.GlobalNamespace.isGlobalScope(GlobalNamespace.java:276) */
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
    
    ///region Test suites for executable com.google.javascript.jscomp.GlobalNamespace.ensureGenerated
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ensureGenerated()
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#ensureGenerated()}
 * @utbot.executesCondition {@code (!generated): False}
 *  */
    @Test
    public void testEnsureGenerated_Generated() throws Exception  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "generated", true);
        
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Method ensureGeneratedMethod = globalNamespaceClazz.getDeclaredMethod("ensureGenerated");
        ensureGeneratedMethod.setAccessible(true);
        java.lang.Object[] ensureGeneratedMethodArguments = new java.lang.Object[0];
        ensureGeneratedMethod.invoke(globalNamespace, ensureGeneratedMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ensureGenerated()
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#ensureGenerated()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testEnsureGenerated_ThrowNullPointerException() throws Throwable  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.ensureGenerated] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:266)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:290)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:494)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:225)
            com.google.javascript.jscomp.GlobalNamespace.ensureGenerated(GlobalNamespace.java:152) */
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Method ensureGeneratedMethod = globalNamespaceClazz.getDeclaredMethod("ensureGenerated");
        ensureGeneratedMethod.setAccessible(true);
        java.lang.Object[] ensureGeneratedMethodArguments = new java.lang.Object[0];
        try {
            ensureGeneratedMethod.invoke(globalNamespace, ensureGeneratedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#ensureGenerated()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testEnsureGenerated_ThrowNullPointerException_3() throws Throwable  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) root)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "root", root);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.ensureGenerated] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:266)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:290)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:494)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:225)
            com.google.javascript.jscomp.GlobalNamespace.ensureGenerated(GlobalNamespace.java:152) */
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Method ensureGeneratedMethod = globalNamespaceClazz.getDeclaredMethod("ensureGenerated");
        ensureGeneratedMethod.setAccessible(true);
        java.lang.Object[] ensureGeneratedMethodArguments = new java.lang.Object[0];
        try {
            ensureGeneratedMethod.invoke(globalNamespace, ensureGeneratedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#ensureGenerated()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testEnsureGenerated_ThrowNullPointerException_1() throws Throwable  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Object root = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) root)).setType(-255);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "root", root);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.ensureGenerated] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:266)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:290)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:494)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:225)
            com.google.javascript.jscomp.GlobalNamespace.ensureGenerated(GlobalNamespace.java:152) */
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Method ensureGeneratedMethod = globalNamespaceClazz.getDeclaredMethod("ensureGenerated");
        ensureGeneratedMethod.setAccessible(true);
        java.lang.Object[] ensureGeneratedMethodArguments = new java.lang.Object[0];
        try {
            ensureGeneratedMethod.invoke(globalNamespace, ensureGeneratedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#ensureGenerated()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testEnsureGenerated_ThrowNullPointerException_2() throws Throwable  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Object root = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) root)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "root", root);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.ensureGenerated] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:266)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:290)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:494)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:225)
            com.google.javascript.jscomp.GlobalNamespace.ensureGenerated(GlobalNamespace.java:152) */
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Method ensureGeneratedMethod = globalNamespaceClazz.getDeclaredMethod("ensureGenerated");
        ensureGeneratedMethod.setAccessible(true);
        java.lang.Object[] ensureGeneratedMethodArguments = new java.lang.Object[0];
        try {
            ensureGeneratedMethod.invoke(globalNamespace, ensureGeneratedMethodArguments);
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
 * @utbot.invokes com.google.javascript.jscomp.GlobalNamespace#ensureGenerated()
 * @utbot.returnsFrom {@code return nameMap;}
 *  */
    @Test
    public void testGetNameIndex_GlobalNamespaceEnsureGenerated() throws Exception  {
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
        Object externsRoot = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) externsRoot)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(externsRoot, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.getNameIndex] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:266)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:290)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:494)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:221)
            com.google.javascript.jscomp.GlobalNamespace.ensureGenerated(GlobalNamespace.java:152)
            com.google.javascript.jscomp.GlobalNamespace.getNameIndex(GlobalNamespace.java:170) */
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
        Object externsRoot = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) externsRoot)).setType(-255);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.getNameIndex] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:266)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:290)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:494)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:221)
            com.google.javascript.jscomp.GlobalNamespace.ensureGenerated(GlobalNamespace.java:152)
            com.google.javascript.jscomp.GlobalNamespace.getNameIndex(GlobalNamespace.java:170) */
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
        Object externsRoot = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) externsRoot)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        int[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(externsRoot, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.getNameIndex] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:266)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:290)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:494)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:221)
            com.google.javascript.jscomp.GlobalNamespace.ensureGenerated(GlobalNamespace.java:152)
            com.google.javascript.jscomp.GlobalNamespace.getNameIndex(GlobalNamespace.java:170) */
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
        Object externsRoot = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) externsRoot)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(externsRoot, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.getNameIndex] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:266)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:290)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:494)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:221)
            com.google.javascript.jscomp.GlobalNamespace.ensureGenerated(GlobalNamespace.java:152)
            com.google.javascript.jscomp.GlobalNamespace.getNameIndex(GlobalNamespace.java:170) */
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
            com.google.javascript.jscomp.GlobalNamespace.getTopVarName(GlobalNamespace.java:249) */
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
    
    ///region Test suites for executable com.google.javascript.jscomp.GlobalNamespace.getAllSymbols
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAllSymbols()
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#getAllSymbols()}
 * @utbot.invokes com.google.javascript.jscomp.GlobalNamespace#ensureGenerated()
 * @utbot.invokes {@link com.google.javascript.jscomp.GlobalNamespace#getNameIndex()}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.invokes {@link java.util.Collections#unmodifiableCollection(java.util.Collection)}
 * @utbot.returnsFrom {@code return Collections.unmodifiableCollection(getNameIndex().values());}
 *  */
    @Test
    public void testGetAllSymbols_CollectionsUnmodifiableCollection() throws Exception  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "generated", true);
        LinkedHashMap nameMap = new LinkedHashMap();
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "nameMap", nameMap);
        
        Object actual = globalNamespace.getAllSymbols();
        
        Object expected = createInstance("java.util.Collections$UnmodifiableCollection");
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getAllSymbols()
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#getAllSymbols()}
 * @utbot.invokes com.google.javascript.jscomp.GlobalNamespace#ensureGenerated()
 * @utbot.invokes {@link com.google.javascript.jscomp.GlobalNamespace#getNameIndex()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return Collections.unmodifiableCollection(getNameIndex().values());
 *  */
    @Test
    public void testGetAllSymbols_ThrowNullPointerException() throws Exception  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "generated", true);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.getAllSymbols] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.GlobalNamespace.getAllSymbols(GlobalNamespace.java:147) */
        globalNamespace.getAllSymbols();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.GlobalNamespace.getReferences
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getReferences(com.google.javascript.jscomp.GlobalNamespace$Name)
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#getReferences(com.google.javascript.jscomp.GlobalNamespace.Name)}
 * @utbot.returnsFrom {@code return Collections.unmodifiableList(slot.getRefs());}
 *  */
    @Test
    public void testGetReferences_ReturnCollectionsUnmodifiableList() throws Exception  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "generated", true);
        GlobalNamespace.Name name = ((GlobalNamespace.Name) createInstance("com.google.javascript.jscomp.GlobalNamespace$Name"));
        ArrayList refs = new ArrayList();
        setField(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "refs", refs);
        
        List actual = ((List) globalNamespace.getReferences(name));
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#getReferences(com.google.javascript.jscomp.GlobalNamespace.Name)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.returnsFrom {@code return Collections.unmodifiableList(slot.getRefs());}
 *  */
    @Test
    public void testGetReferences_ReturnCollectionsUnmodifiableList_1() throws Exception  {
        Class emptyImmutableListClazz = Class.forName("com.google.common.collect.EmptyImmutableList");
        Object prevINSTANCE = getStaticFieldValue(emptyImmutableListClazz, "INSTANCE");
        try {
            Object instance = createInstance("com.google.common.collect.EmptyImmutableList");
            setStaticField(emptyImmutableListClazz, "INSTANCE", instance);
            GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
            setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "generated", true);
            GlobalNamespace.Name name = new GlobalNamespace.Name(null, null, false);
            
            List actual = ((List) globalNamespace.getReferences(name));
            
            List expected = new ArrayList();
            
            assertTrue(deepEquals(expected, actual));
            
            List finalNameRefs = ((List) getFieldValue(name, "com.google.javascript.jscomp.GlobalNamespace$Name", "refs"));
            
            assertNull(finalNameRefs);
        } finally {
            setStaticField(emptyImmutableListClazz, "INSTANCE", prevINSTANCE);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getReferences(com.google.javascript.jscomp.GlobalNamespace$Name)
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#getReferences(com.google.javascript.jscomp.GlobalNamespace.Name)}
 * @utbot.invokes {@link com.google.javascript.jscomp.GlobalNamespace.Name#getRefs()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return Collections.unmodifiableList(slot.getRefs());
 *  */
    @Test
    public void testGetReferences_ThrowNullPointerException() throws Exception  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "generated", true);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.getReferences] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.GlobalNamespace.getReferences(GlobalNamespace.java:136) */
        globalNamespace.getReferences(((GlobalNamespace.Name) null));
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#getReferences(com.google.javascript.jscomp.GlobalNamespace.Name)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetReferences_ThrowNullPointerException_2() throws Exception  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.getReferences] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:266)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:290)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:494)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:225)
            com.google.javascript.jscomp.GlobalNamespace.ensureGenerated(GlobalNamespace.java:152)
            com.google.javascript.jscomp.GlobalNamespace.getReferences(GlobalNamespace.java:135) */
        globalNamespace.getReferences(((GlobalNamespace.Name) null));
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#getReferences(com.google.javascript.jscomp.GlobalNamespace.Name)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetReferences_ThrowNullPointerException_1() throws Exception  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) root)).setType(-255);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "root", root);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.getReferences] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:266)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:290)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:494)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:225)
            com.google.javascript.jscomp.GlobalNamespace.ensureGenerated(GlobalNamespace.java:152)
            com.google.javascript.jscomp.GlobalNamespace.getReferences(GlobalNamespace.java:135) */
        globalNamespace.getReferences(((GlobalNamespace.Name) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.GlobalNamespace.getNameForest
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNameForest()
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#getNameForest()}
 * @utbot.invokes com.google.javascript.jscomp.GlobalNamespace#ensureGenerated()
 * @utbot.returnsFrom {@code return globalNames;}
 *  */
    @Test
    public void testGetNameForest_GlobalNamespaceEnsureGenerated() throws Exception  {
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
    public void testGetNameForest_ThrowNullPointerException_1() throws Exception  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Object externsRoot = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) externsRoot)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(externsRoot, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.getNameForest] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:266)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:290)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:494)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:221)
            com.google.javascript.jscomp.GlobalNamespace.ensureGenerated(GlobalNamespace.java:152)
            com.google.javascript.jscomp.GlobalNamespace.getNameForest(GlobalNamespace.java:161) */
        globalNamespace.getNameForest();
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#getNameForest()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetNameForest_ThrowNullPointerException() throws Exception  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Object externsRoot = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) externsRoot)).setType(-255);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.getNameForest] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:266)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:290)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:494)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:221)
            com.google.javascript.jscomp.GlobalNamespace.ensureGenerated(GlobalNamespace.java:152)
            com.google.javascript.jscomp.GlobalNamespace.getNameForest(GlobalNamespace.java:161) */
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
        Object externsRoot = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) externsRoot)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        byte[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(externsRoot, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.getNameForest] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:266)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:290)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:494)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:221)
            com.google.javascript.jscomp.GlobalNamespace.ensureGenerated(GlobalNamespace.java:152)
            com.google.javascript.jscomp.GlobalNamespace.getNameForest(GlobalNamespace.java:161) */
        globalNamespace.getNameForest();
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#getNameForest()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetNameForest_ThrowNullPointerException_3() throws Exception  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Object externsRoot = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) externsRoot)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(externsRoot, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.getNameForest] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:266)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:290)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:494)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:221)
            com.google.javascript.jscomp.GlobalNamespace.ensureGenerated(GlobalNamespace.java:152)
            com.google.javascript.jscomp.GlobalNamespace.getNameForest(GlobalNamespace.java:161) */
        globalNamespace.getNameForest();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.GlobalNamespace.scanNewNodes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method scanNewNodes(java.util.List)
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#scanNewNodes(java.util.List)}
 *  */
    @Test
    public void testScanNewNodes() {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        ArrayList arrayList = new ArrayList();
        
        globalNamespace.scanNewNodes(arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#scanNewNodes(java.util.List)}
 * @utbot.iterates iterate the loop {@code for(AstChange info: newNodes)} once
 *  */
    @Test
    public void testScanNewNodes_NotNodeUtilIsObjectLitKey() throws Exception  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        ArrayList arrayList = new ArrayList();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        Class astChangeClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace$AstChange");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Constructor astChangeConstructor = astChangeClazz.getDeclaredConstructor(jSModuleType, scopeType, stringNodeType);
        astChangeConstructor.setAccessible(true);
        java.lang.Object[] astChangeConstructorArguments = new java.lang.Object[3];
        astChangeConstructorArguments[0] = ((Object) null);
        astChangeConstructorArguments[1] = ((Object) null);
        astChangeConstructorArguments[2] = stringNode;
        GlobalNamespace.AstChange astChange = ((GlobalNamespace.AstChange) astChangeConstructor.newInstance(astChangeConstructorArguments));
        arrayList.add(astChange);
        
        globalNamespace.scanNewNodes(arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#scanNewNodes(java.util.List)}
 * @utbot.invokes com.google.javascript.jscomp.GlobalNamespace#scanFromNode(com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace,com.google.javascript.jscomp.JSModule,com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)
 * @utbot.iterates iterate the loop {@code for(AstChange info: newNodes)} once
 *  */
    @Test
    public void testScanNewNodes_NodeUtilIsObjectLitKey() throws Exception  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        ArrayList arrayList = new ArrayList();
        JSModule jSModule = new JSModule(null);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(147);
        GlobalNamespace.AstChange astChange = new GlobalNamespace.AstChange(jSModule, scope, node);
        arrayList.add(astChange);
        
        globalNamespace.scanNewNodes(arrayList);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method scanNewNodes(java.util.List)
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#scanNewNodes(java.util.List)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(AstChange info: newNodes)
 *  */
    @Test
    public void testScanNewNodes_ThrowNullPointerException() {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.scanNewNodes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.GlobalNamespace.scanNewNodes(GlobalNamespace.java:198) */
        globalNamespace.scanNewNodes(null);
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#scanNewNodes(java.util.List)}
 * @utbot.iterates iterate the loop {@code for(AstChange info: newNodes)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !info.node.isQualifiedName() && !NodeUtil.isObjectLitKey(info.node)
 *  */
    @Test
    public void testScanNewNodes_ThrowNullPointerException_1() {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.scanNewNodes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.GlobalNamespace.scanNewNodes(GlobalNamespace.java:199) */
        globalNamespace.scanNewNodes(arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#scanNewNodes(java.util.List)}
 * @utbot.iterates iterate the loop {@code for(AstChange info: newNodes)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !info.node.isQualifiedName() && !NodeUtil.isObjectLitKey(info.node)
 *  */
    @Test
    public void testScanNewNodes_ThrowNullPointerException_2() {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        ArrayList arrayList = new ArrayList();
        GlobalNamespace.AstChange astChange = new GlobalNamespace.AstChange(null, null, null);
        arrayList.add(astChange);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.scanNewNodes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.GlobalNamespace.scanNewNodes(GlobalNamespace.java:199) */
        globalNamespace.scanNewNodes(arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#scanNewNodes(java.util.List)}
 * @utbot.iterates iterate the loop {@code for(AstChange info: newNodes)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scanFromNode(builder, info.module, info.scope, info.node);
 *  */
    @Test
    public void testScanNewNodes_ThrowNullPointerException_4() throws Exception  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        ArrayList arrayList = new ArrayList();
        JSModule jSModule = new JSModule(null);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(42);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        GlobalNamespace.AstChange astChange = new GlobalNamespace.AstChange(jSModule, scope, node);
        arrayList.add(astChange);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.scanNewNodes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.GlobalNamespace.scanFromNode(GlobalNamespace.java:209)
            com.google.javascript.jscomp.GlobalNamespace.scanFromNode(GlobalNamespace.java:210)
            com.google.javascript.jscomp.GlobalNamespace.scanNewNodes(GlobalNamespace.java:202) */
        globalNamespace.scanNewNodes(arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#scanNewNodes(java.util.List)}
 * @utbot.iterates iterate the loop {@code for(AstChange info: newNodes)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scanFromNode(builder, info.module, info.scope, info.node);
 *  */
    @Test
    public void testScanNewNodes_ThrowNullPointerException_3() throws Exception  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        ArrayList arrayList = new ArrayList();
        JSModule jSModule = new JSModule(null);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        Class astChangeClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace$AstChange");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Constructor astChangeConstructor = astChangeClazz.getDeclaredConstructor(jSModuleType, scopeType, stringNodeType);
        astChangeConstructor.setAccessible(true);
        java.lang.Object[] astChangeConstructorArguments = new java.lang.Object[3];
        astChangeConstructorArguments[0] = jSModule;
        astChangeConstructorArguments[1] = scope;
        astChangeConstructorArguments[2] = stringNode;
        GlobalNamespace.AstChange astChange = ((GlobalNamespace.AstChange) astChangeConstructor.newInstance(astChangeConstructorArguments));
        arrayList.add(astChange);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.scanNewNodes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.GlobalNamespace.scanFromNode(GlobalNamespace.java:209)
            com.google.javascript.jscomp.GlobalNamespace.scanFromNode(GlobalNamespace.java:210)
            com.google.javascript.jscomp.GlobalNamespace.scanNewNodes(GlobalNamespace.java:202) */
        globalNamespace.scanNewNodes(arrayList);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method scanNewNodes(java.util.List)
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#scanNewNodes(java.util.List)}
 * @utbot.iterates iterate the loop {@code for(AstChange info: newNodes)} once
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: !info.node.isQualifiedName() && !NodeUtil.isObjectLitKey(info.node)
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testScanNewNodes_ThrowUnsupportedOperationException() {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        ArrayList arrayList = new ArrayList();
        Node node = new Node(38);
        GlobalNamespace.AstChange astChange = new GlobalNamespace.AstChange(null, null, node);
        arrayList.add(astChange);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        globalNamespace.scanNewNodes(arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#scanNewNodes(java.util.List)}
 * @utbot.iterates iterate the loop {@code for(AstChange info: newNodes)} once
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: !info.node.isQualifiedName() && !NodeUtil.isObjectLitKey(info.node)
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testScanNewNodes_ThrowUnsupportedOperationException_1() throws Exception  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        ArrayList arrayList = new ArrayList();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        GlobalNamespace.AstChange astChange = new GlobalNamespace.AstChange(null, null, node);
        arrayList.add(astChange);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        globalNamespace.scanNewNodes(arrayList);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.GlobalNamespace.isGlobalNameReference
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isGlobalNameReference(java.lang.String, com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#isGlobalNameReference(java.lang.String,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String topVarName = getTopVarName(name);
 *  */
    @Test
    public void testIsGlobalNameReference_ThrowNullPointerException() throws Throwable  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.isGlobalNameReference] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.GlobalNamespace.getTopVarName(GlobalNamespace.java:249)
            com.google.javascript.jscomp.GlobalNamespace.isGlobalNameReference(GlobalNamespace.java:238) */
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
    public void testIsGlobalNameReference_ThrowNullPointerException_1() throws Throwable  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        String string = " ";
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.isGlobalNameReference] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.GlobalNamespace.isGlobalVarReference(GlobalNamespace.java:262)
            com.google.javascript.jscomp.GlobalNamespace.isGlobalNameReference(GlobalNamespace.java:239) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return isGlobalVarReference(topVarName, s);
 *  */
    @Test
    public void testIsGlobalNameReference_ThrowNullPointerException_2() throws Throwable  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        String string = ".";
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.isGlobalNameReference] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.GlobalNamespace.isGlobalVarReference(GlobalNamespace.java:262)
            com.google.javascript.jscomp.GlobalNamespace.isGlobalNameReference(GlobalNamespace.java:239) */
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
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        String string = ".\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
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
    
    @Test
    public void testIsGlobalNameReference2() throws Exception  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        String string = "\u0000\u0000";
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
    
    @Test
    public void testIsGlobalNameReference3() throws Exception  {
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
        Method isGlobalNameReferenceMethod = globalNamespaceClazz.getDeclaredMethod("isGlobalNameReference", stringType, scopeType);
        isGlobalNameReferenceMethod.setAccessible(true);
        java.lang.Object[] isGlobalNameReferenceMethodArguments = new java.lang.Object[2];
        isGlobalNameReferenceMethodArguments[0] = string;
        isGlobalNameReferenceMethodArguments[1] = scope;
        boolean actual = ((Boolean) isGlobalNameReferenceMethod.invoke(globalNamespace, isGlobalNameReferenceMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testIsGlobalNameReference4() throws Exception  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        String string = "\u0000";
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars1 = new LinkedHashMap();
        setField(parent, "com.google.javascript.jscomp.Scope", "vars", vars1);
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
    
    ///region OTHER: ERROR SUITE for method isGlobalNameReference(java.lang.String, com.google.javascript.jscomp.Scope)
    
    @Test
    public void testIsGlobalNameReference5() throws Throwable  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        String string = "";
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.isGlobalNameReference] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope.getVar(Scope.java:529)
            com.google.javascript.jscomp.Scope.getVar(Scope.java:533)
            com.google.javascript.jscomp.GlobalNamespace.isGlobalVarReference(GlobalNamespace.java:262)
            com.google.javascript.jscomp.GlobalNamespace.isGlobalNameReference(GlobalNamespace.java:239) */
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
    public void testIsGlobalNameReference6() throws Throwable  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        String string = "\u0000";
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        vars.put(string, var);
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.isGlobalNameReference] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope$Var.isLocal(Scope.java:199)
            com.google.javascript.jscomp.GlobalNamespace.isGlobalVarReference(GlobalNamespace.java:266)
            com.google.javascript.jscomp.GlobalNamespace.isGlobalNameReference(GlobalNamespace.java:239) */
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
    
    ///region Test suites for executable com.google.javascript.jscomp.GlobalNamespace.isGlobalVarReference
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isGlobalVarReference(java.lang.String, com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#isGlobalVarReference(java.lang.String,com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (v == null): True}
 * @utbot.executesCondition {@code (externsScope != null): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope#getVar(java.lang.String)}
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
            com.google.javascript.jscomp.GlobalNamespace.isGlobalVarReference(GlobalNamespace.java:262) */
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
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars1 = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars1);
        
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
    
    @Test
    public void testIsGlobalVarReference2() throws Exception  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
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
    
    ///region OTHER: ERROR SUITE for method isGlobalVarReference(java.lang.String, com.google.javascript.jscomp.Scope)
    
    @Test
    public void testIsGlobalVarReference3() throws Throwable  {
        GlobalNamespace globalNamespace = new GlobalNamespace(null, null);
        String string = "";
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        Scope.Arguments arguments = ((Scope.Arguments) createInstance("com.google.javascript.jscomp.Scope$Arguments"));
        vars.put(string, arguments);
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.isGlobalVarReference] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope$Var.isLocal(Scope.java:199)
            com.google.javascript.jscomp.GlobalNamespace.isGlobalVarReference(GlobalNamespace.java:266) */
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
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        String string = "";
        Scope.Arguments arguments = ((Scope.Arguments) createInstance("com.google.javascript.jscomp.Scope$Arguments"));
        vars.put(string, arguments);
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.isGlobalVarReference] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope.getVar(Scope.java:529)
            com.google.javascript.jscomp.Scope.getVar(Scope.java:533)
            com.google.javascript.jscomp.GlobalNamespace.isGlobalVarReference(GlobalNamespace.java:262) */
        Class globalNamespaceClazz = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class stringType = Class.forName("java.lang.String");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method isGlobalVarReferenceMethod = globalNamespaceClazz.getDeclaredMethod("isGlobalVarReference", stringType, scopeType);
        isGlobalVarReferenceMethod.setAccessible(true);
        java.lang.Object[] isGlobalVarReferenceMethodArguments = new java.lang.Object[2];
        isGlobalVarReferenceMethodArguments[0] = ((Object) null);
        isGlobalVarReferenceMethodArguments[1] = scope;
        try {
            isGlobalVarReferenceMethod.invoke(globalNamespace, isGlobalVarReferenceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.GlobalNamespace.getSlot
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSlot(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#getSlot(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.jscomp.GlobalNamespace#getOwnSlot(java.lang.String)}
 * @utbot.returnsFrom {@code return getOwnSlot(name);}
 *  */
    @Test
    public void testGetSlot_GlobalNamespaceGetOwnSlot() throws Exception  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "generated", true);
        LinkedHashMap nameMap = new LinkedHashMap();
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "nameMap", nameMap);
        
        GlobalNamespace.Name actual = globalNamespace.getSlot(((String) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getSlot(java.lang.String)
    
    @Test(expected = RuntimeException.class)
    public void testGetSlot1() throws Exception  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "compiler", compiler);
        Object externsRoot = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot", externsRoot);
        
        globalNamespace.getSlot(((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.GlobalNamespace.process
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process()
    
    /**
    @utbot.classUnderTest {@link GlobalNamespace}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.GlobalNamespace#process()}
 * @utbot.executesCondition {@code (externsRoot != null): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#traverse(com.google.javascript.jscomp.AbstractCompiler,com.google.javascript.rhino.Node,com.google.javascript.jscomp.NodeTraversal.Callback)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() throws Throwable  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Object externsRoot = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) externsRoot)).setType(-255);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:266)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:290)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:494)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:221) */
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
    
    ///region OTHER: ERROR SUITE for method process()
    
    @Test
    public void testProcess1() throws Throwable  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Object externsRoot = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(132);
        setField(externsRoot, "com.google.javascript.rhino.Node", "parent", parent);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:266)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:290)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:494)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:221) */
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
    
    @Test
    public void testProcess2() throws Throwable  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Object externsRoot = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) externsRoot)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(externsRoot, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:266)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:290)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:494)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:221) */
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
    
    @Test
    public void testProcess3() throws Throwable  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Object root = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "root", root);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:266)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:290)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:494)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:225) */
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
    
    @Test
    public void testProcess4() throws Throwable  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Object externsRoot = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) externsRoot)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(externsRoot, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:266)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:290)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:494)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:221) */
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
    
    @Test
    public void testProcess5() throws Throwable  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Object externsRoot = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) externsRoot)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object objectValue = createInstance("java.lang.Object");
        setField(next, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(externsRoot, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:266)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:290)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:494)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:221) */
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
    
    @Test
    public void testProcess6() throws Throwable  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        
        /* This test fails because method [com.google.javascript.jscomp.GlobalNamespace.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:266)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:290)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:494)
            com.google.javascript.jscomp.GlobalNamespace.process(GlobalNamespace.java:225) */
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
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method process()
    
    @Test(expected = RuntimeException.class)
    public void testProcess7() throws Throwable  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "compiler", compiler);
        Object externsRoot = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) externsRoot)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(externsRoot, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot", externsRoot);
        
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
    
    @Test(expected = RuntimeException.class)
    public void testProcess8() throws Throwable  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "compiler", compiler);
        Object externsRoot = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) externsRoot)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object objectValue = createInstance("java.lang.Object");
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(externsRoot, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot", externsRoot);
        
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
    
    @Test(expected = RuntimeException.class)
    public void testProcess9() throws Throwable  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PhaseOptimizer phaseOptimizer = ((PhaseOptimizer) createInstance("com.google.javascript.jscomp.PhaseOptimizer"));
        compiler.setPhaseOptimizer(phaseOptimizer);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "compiler", compiler);
        Object externsRoot = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot", externsRoot);
        
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
    
    @Test(expected = RuntimeException.class)
    public void testProcess10() throws Throwable  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "compiler", compiler);
        Object externsRoot = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot", externsRoot);
        
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
    
    @Test(expected = RuntimeException.class)
    public void testProcess11() throws Throwable  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PhaseOptimizer phaseOptimizer = ((PhaseOptimizer) createInstance("com.google.javascript.jscomp.PhaseOptimizer"));
        compiler.setPhaseOptimizer(phaseOptimizer);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "compiler", compiler);
        Object externsRoot = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) externsRoot)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(externsRoot, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot", externsRoot);
        
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
    
    @Test(expected = RuntimeException.class)
    public void testProcess12() throws Throwable  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PhaseOptimizer phaseOptimizer = ((PhaseOptimizer) createInstance("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "inLoop", true);
        compiler.setPhaseOptimizer(phaseOptimizer);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "compiler", compiler);
        Object externsRoot = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) externsRoot)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(externsRoot, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot", externsRoot);
        
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
    
    @Test(expected = RuntimeException.class)
    public void testProcess13() throws Throwable  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PhaseOptimizer phaseOptimizer = ((PhaseOptimizer) createInstance("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "inLoop", true);
        Object jsRoot = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "jsRoot", jsRoot);
        compiler.setPhaseOptimizer(phaseOptimizer);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "compiler", compiler);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot", jsRoot);
        
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
    
    @Test(expected = RuntimeException.class)
    public void testProcess14() throws Throwable  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PhaseOptimizer phaseOptimizer = ((PhaseOptimizer) createInstance("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "inLoop", true);
        compiler.setPhaseOptimizer(phaseOptimizer);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "compiler", compiler);
        Object externsRoot = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) externsRoot)).setType(105);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot", externsRoot);
        
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
    
    @Test(expected = RuntimeException.class)
    public void testProcess15() throws Throwable  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "compiler", compiler);
        Object externsRoot = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) externsRoot)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(externsRoot, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot", externsRoot);
        
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
    
    @Test(expected = RuntimeException.class)
    public void testProcess16() throws Throwable  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PhaseOptimizer phaseOptimizer = ((PhaseOptimizer) createInstance("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "inLoop", true);
        compiler.setPhaseOptimizer(phaseOptimizer);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "compiler", compiler);
        Object externsRoot = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot", externsRoot);
        
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
    
    ///region OTHER: TIMEOUTS for method process()
    
    @Test(timeout = 1000L)
    public void testProcess17() throws Throwable  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Object externsRoot = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) externsRoot)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", propListHead);
        setField(externsRoot, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot", externsRoot);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
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
    
    @Test(timeout = 1000L)
    public void testProcess18() throws Throwable  {
        GlobalNamespace globalNamespace = ((GlobalNamespace) createInstance("com.google.javascript.jscomp.GlobalNamespace"));
        Object externsRoot = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent);
        setField(externsRoot, "com.google.javascript.rhino.Node", "parent", parent);
        setField(globalNamespace, "com.google.javascript.jscomp.GlobalNamespace", "externsRoot", externsRoot);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
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
        
                java.lang.reflect.Method methodForGetDeclaredFields905515034626000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields905515034626000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass905515034632700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields905515034626000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass905515034632700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields905515034967100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields905515034967100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass905515034969400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields905515034967100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass905515034969400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields905515038575000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields905515038575000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass905515038579200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields905515038575000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass905515038579200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
                modifiersField.setAccessible(true);
                modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
                
                return field.get(null);
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (java.lang.reflect.InvocationTargetException e3) {
                e3.printStackTrace();
            }
        } while (clazz != null);
    
        throw new NoSuchFieldException("Field '" + fieldName + "' not found on class " + originClass);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields905515039197700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields905515039197700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass905515039200900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields905515039197700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass905515039200900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

