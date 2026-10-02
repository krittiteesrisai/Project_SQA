package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.ScriptOrFnNode;
import com.google.javascript.rhino.FunctionNode;
import com.google.javascript.rhino.Node;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.LinkedHashMap;
import com.google.common.collect.ImmutableSortedMap;
import java.util.Map.Entry;
import java.util.Map;
import com.google.common.collect.ImmutableListMultimap;
import java.lang.reflect.InvocationTargetException;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMap;
import org.apache.tools.ant.types.selectors.modifiedselector.EqualComparator;
import java.util.ArrayList;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertTrue;

public final class com_google_javascript_jscomp_PureFunctionIdentifierTest {
    ///region Test suites for executable com.google.javascript.jscomp.PureFunctionIdentifier.process
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PureFunctionIdentifier}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (externs != null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: externs != null || root != null
 *  */
    @Test(expected = IllegalStateException.class)
    public void testProcess_ThrowIllegalStateException_1() throws Exception  {
        PureFunctionIdentifier pureFunctionIdentifier = ((PureFunctionIdentifier) createInstance("com.google.javascript.jscomp.PureFunctionIdentifier"));
        ScriptOrFnNode externs = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(pureFunctionIdentifier, "com.google.javascript.jscomp.PureFunctionIdentifier", "externs", externs);
        
        pureFunctionIdentifier.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link PureFunctionIdentifier}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (externs != null): False}
 * @utbot.executesCondition {@code (root != null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: externs != null || root != null
 *  */
    @Test(expected = IllegalStateException.class)
    public void testProcess_ThrowIllegalStateException() throws Exception  {
        PureFunctionIdentifier pureFunctionIdentifier = ((PureFunctionIdentifier) createInstance("com.google.javascript.jscomp.PureFunctionIdentifier"));
        ScriptOrFnNode root = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(pureFunctionIdentifier, "com.google.javascript.jscomp.PureFunctionIdentifier", "root", root);
        
        pureFunctionIdentifier.process(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PureFunctionIdentifier}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() throws Exception  {
        PureFunctionIdentifier pureFunctionIdentifier = ((PureFunctionIdentifier) createInstance("com.google.javascript.jscomp.PureFunctionIdentifier"));
        
        /* This test fails because method [com.google.javascript.jscomp.PureFunctionIdentifier.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.PureFunctionIdentifier.process(PureFunctionIdentifier.java:97) */
        pureFunctionIdentifier.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link PureFunctionIdentifier}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_1() throws Exception  {
        PureFunctionIdentifier pureFunctionIdentifier = ((PureFunctionIdentifier) createInstance("com.google.javascript.jscomp.PureFunctionIdentifier"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        byte[] objectValue = {};
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.PureFunctionIdentifier.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.PureFunctionIdentifier.process(PureFunctionIdentifier.java:97) */
        pureFunctionIdentifier.process(functionNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link PureFunctionIdentifier}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_2() throws Exception  {
        PureFunctionIdentifier pureFunctionIdentifier = ((PureFunctionIdentifier) createInstance("com.google.javascript.jscomp.PureFunctionIdentifier"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(120);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PureFunctionIdentifier.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.PureFunctionIdentifier.process(PureFunctionIdentifier.java:97) */
        pureFunctionIdentifier.process(functionNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link PureFunctionIdentifier}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_3() throws Exception  {
        PureFunctionIdentifier pureFunctionIdentifier = ((PureFunctionIdentifier) createInstance("com.google.javascript.jscomp.PureFunctionIdentifier"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-256);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(132);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        int[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PureFunctionIdentifier.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.PureFunctionIdentifier.process(PureFunctionIdentifier.java:97) */
        pureFunctionIdentifier.process(functionNode, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCallableDefinitions(com.google.javascript.jscomp.DefinitionProvider, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PureFunctionIdentifier}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier#getCallableDefinitions(com.google.javascript.jscomp.DefinitionProvider,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testGetCallableDefinitions_ReturnNull() throws Exception  {
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class definitionProviderType = Class.forName("com.google.javascript.jscomp.DefinitionProvider");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCallableDefinitionsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("getCallableDefinitions", definitionProviderType, functionNodeType);
        getCallableDefinitionsMethod.setAccessible(true);
        java.lang.Object[] getCallableDefinitionsMethodArguments = new java.lang.Object[2];
        getCallableDefinitionsMethodArguments[0] = ((Object) null);
        getCallableDefinitionsMethodArguments[1] = functionNode;
        Collection actual = ((Collection) getCallableDefinitionsMethod.invoke(null, getCallableDefinitionsMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PureFunctionIdentifier}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier#getCallableDefinitions(com.google.javascript.jscomp.DefinitionProvider,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testGetCallableDefinitions_ReturnNull_1() throws Exception  {
        SimpleDefinitionFinder simpleDefinitionFinder = ((SimpleDefinitionFinder) createInstance("com.google.javascript.jscomp.SimpleDefinitionFinder"));
        LinkedHashMap definitionSiteMap = new LinkedHashMap();
        setField(simpleDefinitionFinder, "com.google.javascript.jscomp.SimpleDefinitionFinder", "definitionSiteMap", definitionSiteMap);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class simpleDefinitionFinderType = Class.forName("com.google.javascript.jscomp.DefinitionProvider");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCallableDefinitionsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("getCallableDefinitions", simpleDefinitionFinderType, stringNodeType);
        getCallableDefinitionsMethod.setAccessible(true);
        java.lang.Object[] getCallableDefinitionsMethodArguments = new java.lang.Object[2];
        getCallableDefinitionsMethodArguments[0] = simpleDefinitionFinder;
        getCallableDefinitionsMethodArguments[1] = stringNode;
        Collection actual = ((Collection) getCallableDefinitionsMethod.invoke(null, getCallableDefinitionsMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PureFunctionIdentifier}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier#getCallableDefinitions(com.google.javascript.jscomp.DefinitionProvider,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testGetCallableDefinitions_ReturnNull_3() throws Exception  {
        SimpleDefinitionFinder simpleDefinitionFinder = ((SimpleDefinitionFinder) createInstance("com.google.javascript.jscomp.SimpleDefinitionFinder"));
        LinkedHashMap definitionSiteMap = new LinkedHashMap();
        setField(simpleDefinitionFinder, "com.google.javascript.jscomp.SimpleDefinitionFinder", "definitionSiteMap", definitionSiteMap);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class simpleDefinitionFinderType = Class.forName("com.google.javascript.jscomp.DefinitionProvider");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCallableDefinitionsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("getCallableDefinitions", simpleDefinitionFinderType, stringNodeType);
        getCallableDefinitionsMethod.setAccessible(true);
        java.lang.Object[] getCallableDefinitionsMethodArguments = new java.lang.Object[2];
        getCallableDefinitionsMethodArguments[0] = simpleDefinitionFinder;
        getCallableDefinitionsMethodArguments[1] = stringNode;
        Collection actual = ((Collection) getCallableDefinitionsMethod.invoke(null, getCallableDefinitionsMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PureFunctionIdentifier}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier#getCallableDefinitions(com.google.javascript.jscomp.DefinitionProvider,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testGetCallableDefinitions_ReturnNull_4() throws Exception  {
        SimpleDefinitionFinder simpleDefinitionFinder = ((SimpleDefinitionFinder) createInstance("com.google.javascript.jscomp.SimpleDefinitionFinder"));
        LinkedHashMap definitionSiteMap = new LinkedHashMap();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        DefinitionSite definitionSite = ((DefinitionSite) createInstance("com.google.javascript.jscomp.DefinitionSite"));
        definitionSiteMap.put(scriptOrFnNode, definitionSite);
        setField(simpleDefinitionFinder, "com.google.javascript.jscomp.SimpleDefinitionFinder", "definitionSiteMap", definitionSiteMap);
        
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class simpleDefinitionFinderType = Class.forName("com.google.javascript.jscomp.DefinitionProvider");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCallableDefinitionsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("getCallableDefinitions", simpleDefinitionFinderType, scriptOrFnNodeType);
        getCallableDefinitionsMethod.setAccessible(true);
        java.lang.Object[] getCallableDefinitionsMethodArguments = new java.lang.Object[2];
        getCallableDefinitionsMethodArguments[0] = simpleDefinitionFinder;
        getCallableDefinitionsMethodArguments[1] = scriptOrFnNode;
        Collection actual = ((Collection) getCallableDefinitionsMethod.invoke(null, getCallableDefinitionsMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PureFunctionIdentifier}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier#getCallableDefinitions(com.google.javascript.jscomp.DefinitionProvider,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testGetCallableDefinitions_ReturnNull_2() throws Exception  {
        SimpleDefinitionFinder simpleDefinitionFinder = ((SimpleDefinitionFinder) createInstance("com.google.javascript.jscomp.SimpleDefinitionFinder"));
        LinkedHashMap definitionSiteMap = new LinkedHashMap();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        DefinitionSite definitionSite = ((DefinitionSite) createInstance("com.google.javascript.jscomp.DefinitionSite"));
        definitionSiteMap.put(functionNode, definitionSite);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        definitionSiteMap.put(functionNode1, definitionSite);
        setField(simpleDefinitionFinder, "com.google.javascript.jscomp.SimpleDefinitionFinder", "definitionSiteMap", definitionSiteMap);
        
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class simpleDefinitionFinderType = Class.forName("com.google.javascript.jscomp.DefinitionProvider");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCallableDefinitionsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("getCallableDefinitions", simpleDefinitionFinderType, functionNodeType);
        getCallableDefinitionsMethod.setAccessible(true);
        java.lang.Object[] getCallableDefinitionsMethodArguments = new java.lang.Object[2];
        getCallableDefinitionsMethodArguments[0] = simpleDefinitionFinder;
        getCallableDefinitionsMethodArguments[1] = functionNode;
        Collection actual = ((Collection) getCallableDefinitionsMethod.invoke(null, getCallableDefinitionsMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCallableDefinitions(com.google.javascript.jscomp.DefinitionProvider, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PureFunctionIdentifier}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier#getCallableDefinitions(com.google.javascript.jscomp.DefinitionProvider,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetCallableDefinitions_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        NameReferenceGraph nameReferenceGraph = ((NameReferenceGraph) createInstance("com.google.javascript.jscomp.NameReferenceGraph"));
        Object referenceMap = createInstance("com.google.common.collect.EmptyImmutableListMultimap");
        ImmutableSortedMap map = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        java.util.Map.Entry[] entries = {};
        setField(map, "com.google.common.collect.ImmutableSortedMap", "entries", entries);
        setField(map, "com.google.common.collect.ImmutableSortedMap", "fromIndex", -1);
        setField(map, "com.google.common.collect.ImmutableSortedMap", "toIndex", -1);
        setField(referenceMap, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(nameReferenceGraph, "com.google.javascript.jscomp.NameReferenceGraph", "referenceMap", referenceMap);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(33);
        
        /* This test fails because method [com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.google.common.collect.ImmutableSortedMap.get(ImmutableSortedMap.java:409)
            com.google.common.collect.ImmutableListMultimap.get(ImmutableListMultimap.java:266)
            com.google.common.collect.ImmutableListMultimap.get(ImmutableListMultimap.java:49)
            com.google.javascript.jscomp.NameReferenceGraph.getReferencesAt(NameReferenceGraph.java:125)
            com.google.javascript.jscomp.NameReferenceGraph.getDefinitionsReferencedAt(NameReferenceGraph.java:134)
            com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions(PureFunctionIdentifier.java:183) */
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class nameReferenceGraphType = Class.forName("com.google.javascript.jscomp.DefinitionProvider");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCallableDefinitionsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("getCallableDefinitions", nameReferenceGraphType, functionNodeType);
        getCallableDefinitionsMethod.setAccessible(true);
        java.lang.Object[] getCallableDefinitionsMethodArguments = new java.lang.Object[2];
        getCallableDefinitionsMethodArguments[0] = nameReferenceGraph;
        getCallableDefinitionsMethodArguments[1] = functionNode;
        try {
            getCallableDefinitionsMethod.invoke(null, getCallableDefinitionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PureFunctionIdentifier}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier#getCallableDefinitions(com.google.javascript.jscomp.DefinitionProvider,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: definitionProvider.getDefinitionsReferencedAt(name)
 *  */
    @Test
    public void testGetCallableDefinitions_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        SimpleDefinitionFinder simpleDefinitionFinder = ((SimpleDefinitionFinder) createInstance("com.google.javascript.jscomp.SimpleDefinitionFinder"));
        LinkedHashMap definitionSiteMap = new LinkedHashMap();
        setField(simpleDefinitionFinder, "com.google.javascript.jscomp.SimpleDefinitionFinder", "definitionSiteMap", definitionSiteMap);
        Object nameDefinitionMultimap = createInstance("com.google.common.collect.EmptyImmutableListMultimap");
        ImmutableSortedMap map = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        java.util.Map.Entry[] entries = {};
        setField(map, "com.google.common.collect.ImmutableSortedMap", "entries", entries);
        setField(map, "com.google.common.collect.ImmutableSortedMap", "fromIndex", -1);
        setField(map, "com.google.common.collect.ImmutableSortedMap", "toIndex", -1);
        setField(nameDefinitionMultimap, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(simpleDefinitionFinder, "com.google.javascript.jscomp.SimpleDefinitionFinder", "nameDefinitionMultimap", nameDefinitionMultimap);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.google.common.collect.ImmutableSortedMap.get(ImmutableSortedMap.java:409)
            com.google.common.collect.ImmutableListMultimap.get(ImmutableListMultimap.java:266)
            com.google.common.collect.ImmutableListMultimap.get(ImmutableListMultimap.java:49)
            com.google.javascript.jscomp.SimpleDefinitionFinder.getDefinitionsReferencedAt(SimpleDefinitionFinder.java:82)
            com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions(PureFunctionIdentifier.java:183) */
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class simpleDefinitionFinderType = Class.forName("com.google.javascript.jscomp.DefinitionProvider");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCallableDefinitionsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("getCallableDefinitions", simpleDefinitionFinderType, stringNodeType);
        getCallableDefinitionsMethod.setAccessible(true);
        java.lang.Object[] getCallableDefinitionsMethodArguments = new java.lang.Object[2];
        getCallableDefinitionsMethodArguments[0] = simpleDefinitionFinder;
        getCallableDefinitionsMethodArguments[1] = stringNode;
        try {
            getCallableDefinitionsMethod.invoke(null, getCallableDefinitionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PureFunctionIdentifier}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier#getCallableDefinitions(com.google.javascript.jscomp.DefinitionProvider,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: definitionProvider.getDefinitionsReferencedAt(name)
 *  */
    @Test
    public void testGetCallableDefinitions_ThrowNullPointerException() throws Throwable  {
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(33);
        
        /* This test fails because method [com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions(PureFunctionIdentifier.java:183) */
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class definitionProviderType = Class.forName("com.google.javascript.jscomp.DefinitionProvider");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCallableDefinitionsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("getCallableDefinitions", definitionProviderType, functionNodeType);
        getCallableDefinitionsMethod.setAccessible(true);
        java.lang.Object[] getCallableDefinitionsMethodArguments = new java.lang.Object[2];
        getCallableDefinitionsMethodArguments[0] = ((Object) null);
        getCallableDefinitionsMethodArguments[1] = functionNode;
        try {
            getCallableDefinitionsMethod.invoke(null, getCallableDefinitionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PureFunctionIdentifier}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier#getCallableDefinitions(com.google.javascript.jscomp.DefinitionProvider,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: definitionProvider.getDefinitionsReferencedAt(name)
 *  */
    @Test
    public void testGetCallableDefinitions_ThrowNullPointerException_3() throws Throwable  {
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions(PureFunctionIdentifier.java:183) */
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class definitionProviderType = Class.forName("com.google.javascript.jscomp.DefinitionProvider");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCallableDefinitionsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("getCallableDefinitions", definitionProviderType, functionNodeType);
        getCallableDefinitionsMethod.setAccessible(true);
        java.lang.Object[] getCallableDefinitionsMethodArguments = new java.lang.Object[2];
        getCallableDefinitionsMethodArguments[0] = ((Object) null);
        getCallableDefinitionsMethodArguments[1] = functionNode;
        try {
            getCallableDefinitionsMethod.invoke(null, getCallableDefinitionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PureFunctionIdentifier}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier#getCallableDefinitions(com.google.javascript.jscomp.DefinitionProvider,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetCallableDefinitions_ThrowNullPointerException_2() throws Throwable  {
        NameReferenceGraph nameReferenceGraph = ((NameReferenceGraph) createInstance("com.google.javascript.jscomp.NameReferenceGraph"));
        ImmutableListMultimap referenceMap = ((ImmutableListMultimap) createInstance("com.google.common.collect.ImmutableListMultimap"));
        ImmutableSortedMap map = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        java.util.Map.Entry[] entries = {null};
        setField(map, "com.google.common.collect.ImmutableSortedMap", "entries", entries);
        setField(map, "com.google.common.collect.ImmutableSortedMap", "toIndex", 1);
        setField(referenceMap, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(nameReferenceGraph, "com.google.javascript.jscomp.NameReferenceGraph", "referenceMap", referenceMap);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        
        /* This test fails because method [com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions] produces [java.lang.NullPointerException]
            com.google.common.collect.ImmutableSortedMap.binarySearch(ImmutableSortedMap.java:418)
            com.google.common.collect.ImmutableSortedMap.get(ImmutableSortedMap.java:405)
            com.google.common.collect.ImmutableListMultimap.get(ImmutableListMultimap.java:266)
            com.google.common.collect.ImmutableListMultimap.get(ImmutableListMultimap.java:49)
            com.google.javascript.jscomp.NameReferenceGraph.getReferencesAt(NameReferenceGraph.java:125)
            com.google.javascript.jscomp.NameReferenceGraph.getDefinitionsReferencedAt(NameReferenceGraph.java:134)
            com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions(PureFunctionIdentifier.java:183) */
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class nameReferenceGraphType = Class.forName("com.google.javascript.jscomp.DefinitionProvider");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCallableDefinitionsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("getCallableDefinitions", nameReferenceGraphType, scriptOrFnNodeType);
        getCallableDefinitionsMethod.setAccessible(true);
        java.lang.Object[] getCallableDefinitionsMethodArguments = new java.lang.Object[2];
        getCallableDefinitionsMethodArguments[0] = nameReferenceGraph;
        getCallableDefinitionsMethodArguments[1] = scriptOrFnNode;
        try {
            getCallableDefinitionsMethod.invoke(null, getCallableDefinitionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PureFunctionIdentifier}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier#getCallableDefinitions(com.google.javascript.jscomp.DefinitionProvider,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetCallableDefinitions_ThrowNullPointerException_1() throws Throwable  {
        NameReferenceGraph nameReferenceGraph = ((NameReferenceGraph) createInstance("com.google.javascript.jscomp.NameReferenceGraph"));
        Object referenceMap = createInstance("com.google.common.collect.EmptyImmutableListMultimap");
        ImmutableSortedMap map = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        setField(map, "com.google.common.collect.ImmutableSortedMap", "fromIndex", Integer.MIN_VALUE);
        setField(map, "com.google.common.collect.ImmutableSortedMap", "toIndex", -2147483647);
        setField(referenceMap, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(nameReferenceGraph, "com.google.javascript.jscomp.NameReferenceGraph", "referenceMap", referenceMap);
        Node node = new Node(33);
        
        /* This test fails because method [com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions] produces [java.lang.NullPointerException]
            com.google.common.collect.ImmutableSortedMap.binarySearch(ImmutableSortedMap.java:418)
            com.google.common.collect.ImmutableSortedMap.get(ImmutableSortedMap.java:405)
            com.google.common.collect.ImmutableListMultimap.get(ImmutableListMultimap.java:266)
            com.google.common.collect.ImmutableListMultimap.get(ImmutableListMultimap.java:49)
            com.google.javascript.jscomp.NameReferenceGraph.getReferencesAt(NameReferenceGraph.java:125)
            com.google.javascript.jscomp.NameReferenceGraph.getDefinitionsReferencedAt(NameReferenceGraph.java:134)
            com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions(PureFunctionIdentifier.java:183) */
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class nameReferenceGraphType = Class.forName("com.google.javascript.jscomp.DefinitionProvider");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCallableDefinitionsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("getCallableDefinitions", nameReferenceGraphType, nodeType);
        getCallableDefinitionsMethod.setAccessible(true);
        java.lang.Object[] getCallableDefinitionsMethodArguments = new java.lang.Object[2];
        getCallableDefinitionsMethodArguments[0] = nameReferenceGraph;
        getCallableDefinitionsMethodArguments[1] = node;
        try {
            getCallableDefinitionsMethod.invoke(null, getCallableDefinitionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getCallableDefinitions(com.google.javascript.jscomp.DefinitionProvider, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PureFunctionIdentifier}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier#getCallableDefinitions(com.google.javascript.jscomp.DefinitionProvider,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: definitionProvider.getDefinitionsReferencedAt(name)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetCallableDefinitions_ThrowIllegalStateException() throws Throwable  {
        SimpleDefinitionFinder simpleDefinitionFinder = ((SimpleDefinitionFinder) createInstance("com.google.javascript.jscomp.SimpleDefinitionFinder"));
        LinkedHashMap definitionSiteMap = new LinkedHashMap();
        setField(simpleDefinitionFinder, "com.google.javascript.jscomp.SimpleDefinitionFinder", "definitionSiteMap", definitionSiteMap);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(33);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(40);
        setField(functionNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class simpleDefinitionFinderType = Class.forName("com.google.javascript.jscomp.DefinitionProvider");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCallableDefinitionsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("getCallableDefinitions", simpleDefinitionFinderType, functionNodeType);
        getCallableDefinitionsMethod.setAccessible(true);
        java.lang.Object[] getCallableDefinitionsMethodArguments = new java.lang.Object[2];
        getCallableDefinitionsMethodArguments[0] = simpleDefinitionFinder;
        getCallableDefinitionsMethodArguments[1] = functionNode;
        try {
            getCallableDefinitionsMethod.invoke(null, getCallableDefinitionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PureFunctionIdentifier}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier#getCallableDefinitions(com.google.javascript.jscomp.DefinitionProvider,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: definitionProvider.getDefinitionsReferencedAt(name)
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetCallableDefinitions_ThrowUnsupportedOperationException() throws Throwable  {
        SimpleDefinitionFinder simpleDefinitionFinder = ((SimpleDefinitionFinder) createInstance("com.google.javascript.jscomp.SimpleDefinitionFinder"));
        LinkedHashMap definitionSiteMap = new LinkedHashMap();
        setField(simpleDefinitionFinder, "com.google.javascript.jscomp.SimpleDefinitionFinder", "definitionSiteMap", definitionSiteMap);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(33);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class simpleDefinitionFinderType = Class.forName("com.google.javascript.jscomp.DefinitionProvider");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCallableDefinitionsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("getCallableDefinitions", simpleDefinitionFinderType, functionNodeType);
        getCallableDefinitionsMethod.setAccessible(true);
        java.lang.Object[] getCallableDefinitionsMethodArguments = new java.lang.Object[2];
        getCallableDefinitionsMethodArguments[0] = simpleDefinitionFinder;
        getCallableDefinitionsMethodArguments[1] = functionNode;
        try {
            getCallableDefinitionsMethod.invoke(null, getCallableDefinitionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PureFunctionIdentifier}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier#getCallableDefinitions(com.google.javascript.jscomp.DefinitionProvider,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetCallableDefinitions_ThrowIndexOutOfBoundsException() throws Throwable  {
        NameReferenceGraph nameReferenceGraph = ((NameReferenceGraph) createInstance("com.google.javascript.jscomp.NameReferenceGraph"));
        ImmutableListMultimap referenceMap = ((ImmutableListMultimap) createInstance("com.google.common.collect.ImmutableListMultimap"));
        ImmutableSortedMap map = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        java.util.Map.Entry[] entries = new java.util.Map.Entry[9];
        Object attributeEntry = createInstance("java.text.AttributeEntry");
        Object value = createInstance("com.google.common.collect.ImmutableSortedAsList");
        setField(value, "com.google.common.collect.RegularImmutableList", "offset", 1163927785);
        setField(value, "com.google.common.collect.RegularImmutableList", "size", 1084219159);
        java.lang.Object[] array = {null};
        setField(value, "com.google.common.collect.RegularImmutableList", "array", array);
        setField(attributeEntry, "java.text.AttributeEntry", "value", value);
        entries[0] = ((Map.Entry) attributeEntry);
        setField(map, "com.google.common.collect.ImmutableSortedMap", "entries", entries);
        setField(map, "com.google.common.collect.ImmutableSortedMap", "fromIndex", -1);
        setField(map, "com.google.common.collect.ImmutableSortedMap", "toIndex", -1);
        setField(referenceMap, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(nameReferenceGraph, "com.google.javascript.jscomp.NameReferenceGraph", "referenceMap", referenceMap);
        Node node = new Node(33);
        
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class nameReferenceGraphType = Class.forName("com.google.javascript.jscomp.DefinitionProvider");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCallableDefinitionsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("getCallableDefinitions", nameReferenceGraphType, nodeType);
        getCallableDefinitionsMethod.setAccessible(true);
        java.lang.Object[] getCallableDefinitionsMethodArguments = new java.lang.Object[2];
        getCallableDefinitionsMethodArguments[0] = nameReferenceGraph;
        getCallableDefinitionsMethodArguments[1] = node;
        try {
            getCallableDefinitionsMethod.invoke(null, getCallableDefinitionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getCallableDefinitions(com.google.javascript.jscomp.DefinitionProvider, com.google.javascript.rhino.Node)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier#getCallableDefinitions(com.google.javascript.jscomp.DefinitionProvider,com.google.javascript.rhino.Node)}
     */
    @Test
    public void testGetCallableDefinitionsThrowsNPE() throws Throwable  {
        SimpleDefinitionFinder simpleDefinitionFinder = new SimpleDefinitionFinder(null);
        
        /* This test fails because method [com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isGetProp(NodeUtil.java:805)
            com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions(PureFunctionIdentifier.java:179) */
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class simpleDefinitionFinderType = Class.forName("com.google.javascript.jscomp.DefinitionProvider");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCallableDefinitionsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("getCallableDefinitions", simpleDefinitionFinderType, nodeType);
        getCallableDefinitionsMethod.setAccessible(true);
        java.lang.Object[] getCallableDefinitionsMethodArguments = new java.lang.Object[2];
        getCallableDefinitionsMethodArguments[0] = simpleDefinitionFinder;
        getCallableDefinitionsMethodArguments[1] = ((Object) null);
        try {
            getCallableDefinitionsMethod.invoke(null, getCallableDefinitionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getCallableDefinitions(com.google.javascript.jscomp.DefinitionProvider, com.google.javascript.rhino.Node)
    
    @Test
    public void testGetCallableDefinitions1() throws Exception  {
        NameReferenceGraph nameReferenceGraph = ((NameReferenceGraph) createInstance("com.google.javascript.jscomp.NameReferenceGraph"));
        Object referenceMap = createInstance("com.google.common.collect.Multimaps$UnmodifiableListMultimap");
        ImmutableListMultimap delegate = ((ImmutableListMultimap) createInstance("com.google.common.collect.ImmutableListMultimap"));
        ImmutableSortedMap map = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        setField(delegate, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(referenceMap, "com.google.common.collect.Multimaps$UnmodifiableMultimap", "delegate", delegate);
        setField(nameReferenceGraph, "com.google.javascript.jscomp.NameReferenceGraph", "referenceMap", referenceMap);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class nameReferenceGraphType = Class.forName("com.google.javascript.jscomp.DefinitionProvider");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCallableDefinitionsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("getCallableDefinitions", nameReferenceGraphType, stringNodeType);
        getCallableDefinitionsMethod.setAccessible(true);
        java.lang.Object[] getCallableDefinitionsMethodArguments = new java.lang.Object[2];
        getCallableDefinitionsMethodArguments[0] = nameReferenceGraph;
        getCallableDefinitionsMethodArguments[1] = stringNode;
        Collection actual = ((Collection) getCallableDefinitionsMethod.invoke(null, getCallableDefinitionsMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testGetCallableDefinitions2() throws Exception  {
        NameReferenceGraph nameReferenceGraph = ((NameReferenceGraph) createInstance("com.google.javascript.jscomp.NameReferenceGraph"));
        Object referenceMap = createInstance("com.google.common.collect.EmptyImmutableListMultimap");
        ImmutableSortedMap map = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        java.util.Map.Entry[] entries = new java.util.Map.Entry[9];
        Object attributeEntry = createInstance("java.text.AttributeEntry");
        entries[0] = ((Map.Entry) attributeEntry);
        setField(map, "com.google.common.collect.ImmutableSortedMap", "entries", entries);
        setField(map, "com.google.common.collect.ImmutableSortedMap", "fromIndex", -1);
        setField(map, "com.google.common.collect.ImmutableSortedMap", "toIndex", -2147483520);
        setField(referenceMap, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(nameReferenceGraph, "com.google.javascript.jscomp.NameReferenceGraph", "referenceMap", referenceMap);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class nameReferenceGraphType = Class.forName("com.google.javascript.jscomp.DefinitionProvider");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCallableDefinitionsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("getCallableDefinitions", nameReferenceGraphType, stringNodeType);
        getCallableDefinitionsMethod.setAccessible(true);
        java.lang.Object[] getCallableDefinitionsMethodArguments = new java.lang.Object[2];
        getCallableDefinitionsMethodArguments[0] = nameReferenceGraph;
        getCallableDefinitionsMethodArguments[1] = stringNode;
        Collection actual = ((Collection) getCallableDefinitionsMethod.invoke(null, getCallableDefinitionsMethodArguments));
        
        assertNull(actual);
        
        Multimap nameReferenceGraphReferenceMap = ((Multimap) getFieldValue(nameReferenceGraph, "com.google.javascript.jscomp.NameReferenceGraph", "referenceMap"));
        ImmutableMap nameReferenceGraphReferenceMapReferenceMapMap = ((ImmutableMap) getFieldValue(nameReferenceGraphReferenceMap, "com.google.common.collect.ImmutableMultimap", "map"));
        java.util.Map.Entry[] nameReferenceGraphReferenceMapReferenceMapMapReferenceMapMapEntries = ((java.util.Map.Entry[]) getFieldValue(nameReferenceGraphReferenceMapReferenceMapMap, "com.google.common.collect.ImmutableSortedMap", "entries"));
        Map.Entry finalNameReferenceGraphReferenceMapMapEntries1 = ((Map.Entry) get(nameReferenceGraphReferenceMapReferenceMapMapReferenceMapMapEntries, 1));
        Multimap nameReferenceGraphReferenceMap1 = ((Multimap) getFieldValue(nameReferenceGraph, "com.google.javascript.jscomp.NameReferenceGraph", "referenceMap"));
        ImmutableMap nameReferenceGraphReferenceMap1ReferenceMapMap = ((ImmutableMap) getFieldValue(nameReferenceGraphReferenceMap1, "com.google.common.collect.ImmutableMultimap", "map"));
        java.util.Map.Entry[] nameReferenceGraphReferenceMap1ReferenceMapMapReferenceMapMapEntries = ((java.util.Map.Entry[]) getFieldValue(nameReferenceGraphReferenceMap1ReferenceMapMap, "com.google.common.collect.ImmutableSortedMap", "entries"));
        Map.Entry finalNameReferenceGraphReferenceMapMapEntries2 = ((Map.Entry) get(nameReferenceGraphReferenceMap1ReferenceMapMapReferenceMapMapEntries, 2));
        Multimap nameReferenceGraphReferenceMap2 = ((Multimap) getFieldValue(nameReferenceGraph, "com.google.javascript.jscomp.NameReferenceGraph", "referenceMap"));
        ImmutableMap nameReferenceGraphReferenceMap2ReferenceMapMap = ((ImmutableMap) getFieldValue(nameReferenceGraphReferenceMap2, "com.google.common.collect.ImmutableMultimap", "map"));
        java.util.Map.Entry[] nameReferenceGraphReferenceMap2ReferenceMapMapReferenceMapMapEntries = ((java.util.Map.Entry[]) getFieldValue(nameReferenceGraphReferenceMap2ReferenceMapMap, "com.google.common.collect.ImmutableSortedMap", "entries"));
        Map.Entry finalNameReferenceGraphReferenceMapMapEntries3 = ((Map.Entry) get(nameReferenceGraphReferenceMap2ReferenceMapMapReferenceMapMapEntries, 3));
        Multimap nameReferenceGraphReferenceMap3 = ((Multimap) getFieldValue(nameReferenceGraph, "com.google.javascript.jscomp.NameReferenceGraph", "referenceMap"));
        ImmutableMap nameReferenceGraphReferenceMap3ReferenceMapMap = ((ImmutableMap) getFieldValue(nameReferenceGraphReferenceMap3, "com.google.common.collect.ImmutableMultimap", "map"));
        java.util.Map.Entry[] nameReferenceGraphReferenceMap3ReferenceMapMapReferenceMapMapEntries = ((java.util.Map.Entry[]) getFieldValue(nameReferenceGraphReferenceMap3ReferenceMapMap, "com.google.common.collect.ImmutableSortedMap", "entries"));
        Map.Entry finalNameReferenceGraphReferenceMapMapEntries4 = ((Map.Entry) get(nameReferenceGraphReferenceMap3ReferenceMapMapReferenceMapMapEntries, 4));
        Multimap nameReferenceGraphReferenceMap4 = ((Multimap) getFieldValue(nameReferenceGraph, "com.google.javascript.jscomp.NameReferenceGraph", "referenceMap"));
        ImmutableMap nameReferenceGraphReferenceMap4ReferenceMapMap = ((ImmutableMap) getFieldValue(nameReferenceGraphReferenceMap4, "com.google.common.collect.ImmutableMultimap", "map"));
        java.util.Map.Entry[] nameReferenceGraphReferenceMap4ReferenceMapMapReferenceMapMapEntries = ((java.util.Map.Entry[]) getFieldValue(nameReferenceGraphReferenceMap4ReferenceMapMap, "com.google.common.collect.ImmutableSortedMap", "entries"));
        Map.Entry finalNameReferenceGraphReferenceMapMapEntries5 = ((Map.Entry) get(nameReferenceGraphReferenceMap4ReferenceMapMapReferenceMapMapEntries, 5));
        Multimap nameReferenceGraphReferenceMap5 = ((Multimap) getFieldValue(nameReferenceGraph, "com.google.javascript.jscomp.NameReferenceGraph", "referenceMap"));
        ImmutableMap nameReferenceGraphReferenceMap5ReferenceMapMap = ((ImmutableMap) getFieldValue(nameReferenceGraphReferenceMap5, "com.google.common.collect.ImmutableMultimap", "map"));
        java.util.Map.Entry[] nameReferenceGraphReferenceMap5ReferenceMapMapReferenceMapMapEntries = ((java.util.Map.Entry[]) getFieldValue(nameReferenceGraphReferenceMap5ReferenceMapMap, "com.google.common.collect.ImmutableSortedMap", "entries"));
        Map.Entry finalNameReferenceGraphReferenceMapMapEntries6 = ((Map.Entry) get(nameReferenceGraphReferenceMap5ReferenceMapMapReferenceMapMapEntries, 6));
        Multimap nameReferenceGraphReferenceMap6 = ((Multimap) getFieldValue(nameReferenceGraph, "com.google.javascript.jscomp.NameReferenceGraph", "referenceMap"));
        ImmutableMap nameReferenceGraphReferenceMap6ReferenceMapMap = ((ImmutableMap) getFieldValue(nameReferenceGraphReferenceMap6, "com.google.common.collect.ImmutableMultimap", "map"));
        java.util.Map.Entry[] nameReferenceGraphReferenceMap6ReferenceMapMapReferenceMapMapEntries = ((java.util.Map.Entry[]) getFieldValue(nameReferenceGraphReferenceMap6ReferenceMapMap, "com.google.common.collect.ImmutableSortedMap", "entries"));
        Map.Entry finalNameReferenceGraphReferenceMapMapEntries7 = ((Map.Entry) get(nameReferenceGraphReferenceMap6ReferenceMapMapReferenceMapMapEntries, 7));
        Multimap nameReferenceGraphReferenceMap7 = ((Multimap) getFieldValue(nameReferenceGraph, "com.google.javascript.jscomp.NameReferenceGraph", "referenceMap"));
        ImmutableMap nameReferenceGraphReferenceMap7ReferenceMapMap = ((ImmutableMap) getFieldValue(nameReferenceGraphReferenceMap7, "com.google.common.collect.ImmutableMultimap", "map"));
        java.util.Map.Entry[] nameReferenceGraphReferenceMap7ReferenceMapMapReferenceMapMapEntries = ((java.util.Map.Entry[]) getFieldValue(nameReferenceGraphReferenceMap7ReferenceMapMap, "com.google.common.collect.ImmutableSortedMap", "entries"));
        Map.Entry finalNameReferenceGraphReferenceMapMapEntries8 = ((Map.Entry) get(nameReferenceGraphReferenceMap7ReferenceMapMapReferenceMapMapEntries, 8));
        
        assertNull(finalNameReferenceGraphReferenceMapMapEntries1);
        
        assertNull(finalNameReferenceGraphReferenceMapMapEntries2);
        
        assertNull(finalNameReferenceGraphReferenceMapMapEntries3);
        
        assertNull(finalNameReferenceGraphReferenceMapMapEntries4);
        
        assertNull(finalNameReferenceGraphReferenceMapMapEntries5);
        
        assertNull(finalNameReferenceGraphReferenceMapMapEntries6);
        
        assertNull(finalNameReferenceGraphReferenceMapMapEntries7);
        
        assertNull(finalNameReferenceGraphReferenceMapMapEntries8);
    }
    
    @Test
    public void testGetCallableDefinitions3() throws Exception  {
        NameReferenceGraph nameReferenceGraph = ((NameReferenceGraph) createInstance("com.google.javascript.jscomp.NameReferenceGraph"));
        Object referenceMap = createInstance("com.google.common.collect.EmptyImmutableListMultimap");
        Object map = createInstance("com.google.common.collect.SingletonImmutableMap");
        Character singleKey = '\u0000';
        setField(map, "com.google.common.collect.SingletonImmutableMap", "singleKey", singleKey);
        setField(referenceMap, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(nameReferenceGraph, "com.google.javascript.jscomp.NameReferenceGraph", "referenceMap", referenceMap);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class nameReferenceGraphType = Class.forName("com.google.javascript.jscomp.DefinitionProvider");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCallableDefinitionsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("getCallableDefinitions", nameReferenceGraphType, stringNodeType);
        getCallableDefinitionsMethod.setAccessible(true);
        java.lang.Object[] getCallableDefinitionsMethodArguments = new java.lang.Object[2];
        getCallableDefinitionsMethodArguments[0] = nameReferenceGraph;
        getCallableDefinitionsMethodArguments[1] = stringNode;
        Collection actual = ((Collection) getCallableDefinitionsMethod.invoke(null, getCallableDefinitionsMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testGetCallableDefinitions4() throws Exception  {
        NameReferenceGraph nameReferenceGraph = ((NameReferenceGraph) createInstance("com.google.javascript.jscomp.NameReferenceGraph"));
        Object referenceMap = createInstance("com.google.common.collect.EmptyImmutableListMultimap");
        ImmutableSortedMap map = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        java.util.Map.Entry[] entries = new java.util.Map.Entry[17];
        Object attributeEntry = createInstance("java.text.AttributeEntry");
        entries[0] = ((Map.Entry) attributeEntry);
        setField(map, "com.google.common.collect.ImmutableSortedMap", "entries", entries);
        EqualComparator comparator = ((EqualComparator) createInstance("org.apache.tools.ant.types.selectors.modifiedselector.EqualComparator"));
        setField(map, "com.google.common.collect.ImmutableSortedMap", "comparator", comparator);
        setField(map, "com.google.common.collect.ImmutableSortedMap", "toIndex", 1);
        setField(referenceMap, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(nameReferenceGraph, "com.google.javascript.jscomp.NameReferenceGraph", "referenceMap", referenceMap);
        Node node = new Node(33);
        
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class nameReferenceGraphType = Class.forName("com.google.javascript.jscomp.DefinitionProvider");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCallableDefinitionsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("getCallableDefinitions", nameReferenceGraphType, nodeType);
        getCallableDefinitionsMethod.setAccessible(true);
        java.lang.Object[] getCallableDefinitionsMethodArguments = new java.lang.Object[2];
        getCallableDefinitionsMethodArguments[0] = nameReferenceGraph;
        getCallableDefinitionsMethodArguments[1] = node;
        Collection actual = ((Collection) getCallableDefinitionsMethod.invoke(null, getCallableDefinitionsMethodArguments));
        
        assertNull(actual);
        
        Multimap nameReferenceGraphReferenceMap = ((Multimap) getFieldValue(nameReferenceGraph, "com.google.javascript.jscomp.NameReferenceGraph", "referenceMap"));
        ImmutableMap nameReferenceGraphReferenceMapReferenceMapMap = ((ImmutableMap) getFieldValue(nameReferenceGraphReferenceMap, "com.google.common.collect.ImmutableMultimap", "map"));
        java.util.Map.Entry[] nameReferenceGraphReferenceMapReferenceMapMapReferenceMapMapEntries = ((java.util.Map.Entry[]) getFieldValue(nameReferenceGraphReferenceMapReferenceMapMap, "com.google.common.collect.ImmutableSortedMap", "entries"));
        Map.Entry finalNameReferenceGraphReferenceMapMapEntries1 = ((Map.Entry) get(nameReferenceGraphReferenceMapReferenceMapMapReferenceMapMapEntries, 1));
        Multimap nameReferenceGraphReferenceMap1 = ((Multimap) getFieldValue(nameReferenceGraph, "com.google.javascript.jscomp.NameReferenceGraph", "referenceMap"));
        ImmutableMap nameReferenceGraphReferenceMap1ReferenceMapMap = ((ImmutableMap) getFieldValue(nameReferenceGraphReferenceMap1, "com.google.common.collect.ImmutableMultimap", "map"));
        java.util.Map.Entry[] nameReferenceGraphReferenceMap1ReferenceMapMapReferenceMapMapEntries = ((java.util.Map.Entry[]) getFieldValue(nameReferenceGraphReferenceMap1ReferenceMapMap, "com.google.common.collect.ImmutableSortedMap", "entries"));
        Map.Entry finalNameReferenceGraphReferenceMapMapEntries2 = ((Map.Entry) get(nameReferenceGraphReferenceMap1ReferenceMapMapReferenceMapMapEntries, 2));
        Multimap nameReferenceGraphReferenceMap2 = ((Multimap) getFieldValue(nameReferenceGraph, "com.google.javascript.jscomp.NameReferenceGraph", "referenceMap"));
        ImmutableMap nameReferenceGraphReferenceMap2ReferenceMapMap = ((ImmutableMap) getFieldValue(nameReferenceGraphReferenceMap2, "com.google.common.collect.ImmutableMultimap", "map"));
        java.util.Map.Entry[] nameReferenceGraphReferenceMap2ReferenceMapMapReferenceMapMapEntries = ((java.util.Map.Entry[]) getFieldValue(nameReferenceGraphReferenceMap2ReferenceMapMap, "com.google.common.collect.ImmutableSortedMap", "entries"));
        Map.Entry finalNameReferenceGraphReferenceMapMapEntries3 = ((Map.Entry) get(nameReferenceGraphReferenceMap2ReferenceMapMapReferenceMapMapEntries, 3));
        Multimap nameReferenceGraphReferenceMap3 = ((Multimap) getFieldValue(nameReferenceGraph, "com.google.javascript.jscomp.NameReferenceGraph", "referenceMap"));
        ImmutableMap nameReferenceGraphReferenceMap3ReferenceMapMap = ((ImmutableMap) getFieldValue(nameReferenceGraphReferenceMap3, "com.google.common.collect.ImmutableMultimap", "map"));
        java.util.Map.Entry[] nameReferenceGraphReferenceMap3ReferenceMapMapReferenceMapMapEntries = ((java.util.Map.Entry[]) getFieldValue(nameReferenceGraphReferenceMap3ReferenceMapMap, "com.google.common.collect.ImmutableSortedMap", "entries"));
        Map.Entry finalNameReferenceGraphReferenceMapMapEntries4 = ((Map.Entry) get(nameReferenceGraphReferenceMap3ReferenceMapMapReferenceMapMapEntries, 4));
        Multimap nameReferenceGraphReferenceMap4 = ((Multimap) getFieldValue(nameReferenceGraph, "com.google.javascript.jscomp.NameReferenceGraph", "referenceMap"));
        ImmutableMap nameReferenceGraphReferenceMap4ReferenceMapMap = ((ImmutableMap) getFieldValue(nameReferenceGraphReferenceMap4, "com.google.common.collect.ImmutableMultimap", "map"));
        java.util.Map.Entry[] nameReferenceGraphReferenceMap4ReferenceMapMapReferenceMapMapEntries = ((java.util.Map.Entry[]) getFieldValue(nameReferenceGraphReferenceMap4ReferenceMapMap, "com.google.common.collect.ImmutableSortedMap", "entries"));
        Map.Entry finalNameReferenceGraphReferenceMapMapEntries5 = ((Map.Entry) get(nameReferenceGraphReferenceMap4ReferenceMapMapReferenceMapMapEntries, 5));
        Multimap nameReferenceGraphReferenceMap5 = ((Multimap) getFieldValue(nameReferenceGraph, "com.google.javascript.jscomp.NameReferenceGraph", "referenceMap"));
        ImmutableMap nameReferenceGraphReferenceMap5ReferenceMapMap = ((ImmutableMap) getFieldValue(nameReferenceGraphReferenceMap5, "com.google.common.collect.ImmutableMultimap", "map"));
        java.util.Map.Entry[] nameReferenceGraphReferenceMap5ReferenceMapMapReferenceMapMapEntries = ((java.util.Map.Entry[]) getFieldValue(nameReferenceGraphReferenceMap5ReferenceMapMap, "com.google.common.collect.ImmutableSortedMap", "entries"));
        Map.Entry finalNameReferenceGraphReferenceMapMapEntries6 = ((Map.Entry) get(nameReferenceGraphReferenceMap5ReferenceMapMapReferenceMapMapEntries, 6));
        Multimap nameReferenceGraphReferenceMap6 = ((Multimap) getFieldValue(nameReferenceGraph, "com.google.javascript.jscomp.NameReferenceGraph", "referenceMap"));
        ImmutableMap nameReferenceGraphReferenceMap6ReferenceMapMap = ((ImmutableMap) getFieldValue(nameReferenceGraphReferenceMap6, "com.google.common.collect.ImmutableMultimap", "map"));
        java.util.Map.Entry[] nameReferenceGraphReferenceMap6ReferenceMapMapReferenceMapMapEntries = ((java.util.Map.Entry[]) getFieldValue(nameReferenceGraphReferenceMap6ReferenceMapMap, "com.google.common.collect.ImmutableSortedMap", "entries"));
        Map.Entry finalNameReferenceGraphReferenceMapMapEntries7 = ((Map.Entry) get(nameReferenceGraphReferenceMap6ReferenceMapMapReferenceMapMapEntries, 7));
        Multimap nameReferenceGraphReferenceMap7 = ((Multimap) getFieldValue(nameReferenceGraph, "com.google.javascript.jscomp.NameReferenceGraph", "referenceMap"));
        ImmutableMap nameReferenceGraphReferenceMap7ReferenceMapMap = ((ImmutableMap) getFieldValue(nameReferenceGraphReferenceMap7, "com.google.common.collect.ImmutableMultimap", "map"));
        java.util.Map.Entry[] nameReferenceGraphReferenceMap7ReferenceMapMapReferenceMapMapEntries = ((java.util.Map.Entry[]) getFieldValue(nameReferenceGraphReferenceMap7ReferenceMapMap, "com.google.common.collect.ImmutableSortedMap", "entries"));
        Map.Entry finalNameReferenceGraphReferenceMapMapEntries8 = ((Map.Entry) get(nameReferenceGraphReferenceMap7ReferenceMapMapReferenceMapMapEntries, 8));
        Multimap nameReferenceGraphReferenceMap8 = ((Multimap) getFieldValue(nameReferenceGraph, "com.google.javascript.jscomp.NameReferenceGraph", "referenceMap"));
        ImmutableMap nameReferenceGraphReferenceMap8ReferenceMapMap = ((ImmutableMap) getFieldValue(nameReferenceGraphReferenceMap8, "com.google.common.collect.ImmutableMultimap", "map"));
        java.util.Map.Entry[] nameReferenceGraphReferenceMap8ReferenceMapMapReferenceMapMapEntries = ((java.util.Map.Entry[]) getFieldValue(nameReferenceGraphReferenceMap8ReferenceMapMap, "com.google.common.collect.ImmutableSortedMap", "entries"));
        Map.Entry finalNameReferenceGraphReferenceMapMapEntries9 = ((Map.Entry) get(nameReferenceGraphReferenceMap8ReferenceMapMapReferenceMapMapEntries, 9));
        Multimap nameReferenceGraphReferenceMap9 = ((Multimap) getFieldValue(nameReferenceGraph, "com.google.javascript.jscomp.NameReferenceGraph", "referenceMap"));
        ImmutableMap nameReferenceGraphReferenceMap9ReferenceMapMap = ((ImmutableMap) getFieldValue(nameReferenceGraphReferenceMap9, "com.google.common.collect.ImmutableMultimap", "map"));
        java.util.Map.Entry[] nameReferenceGraphReferenceMap9ReferenceMapMapReferenceMapMapEntries = ((java.util.Map.Entry[]) getFieldValue(nameReferenceGraphReferenceMap9ReferenceMapMap, "com.google.common.collect.ImmutableSortedMap", "entries"));
        Map.Entry finalNameReferenceGraphReferenceMapMapEntries10 = ((Map.Entry) get(nameReferenceGraphReferenceMap9ReferenceMapMapReferenceMapMapEntries, 10));
        Multimap nameReferenceGraphReferenceMap10 = ((Multimap) getFieldValue(nameReferenceGraph, "com.google.javascript.jscomp.NameReferenceGraph", "referenceMap"));
        ImmutableMap nameReferenceGraphReferenceMap10ReferenceMapMap = ((ImmutableMap) getFieldValue(nameReferenceGraphReferenceMap10, "com.google.common.collect.ImmutableMultimap", "map"));
        java.util.Map.Entry[] nameReferenceGraphReferenceMap10ReferenceMapMapReferenceMapMapEntries = ((java.util.Map.Entry[]) getFieldValue(nameReferenceGraphReferenceMap10ReferenceMapMap, "com.google.common.collect.ImmutableSortedMap", "entries"));
        Map.Entry finalNameReferenceGraphReferenceMapMapEntries11 = ((Map.Entry) get(nameReferenceGraphReferenceMap10ReferenceMapMapReferenceMapMapEntries, 11));
        Multimap nameReferenceGraphReferenceMap11 = ((Multimap) getFieldValue(nameReferenceGraph, "com.google.javascript.jscomp.NameReferenceGraph", "referenceMap"));
        ImmutableMap nameReferenceGraphReferenceMap11ReferenceMapMap = ((ImmutableMap) getFieldValue(nameReferenceGraphReferenceMap11, "com.google.common.collect.ImmutableMultimap", "map"));
        java.util.Map.Entry[] nameReferenceGraphReferenceMap11ReferenceMapMapReferenceMapMapEntries = ((java.util.Map.Entry[]) getFieldValue(nameReferenceGraphReferenceMap11ReferenceMapMap, "com.google.common.collect.ImmutableSortedMap", "entries"));
        Map.Entry finalNameReferenceGraphReferenceMapMapEntries12 = ((Map.Entry) get(nameReferenceGraphReferenceMap11ReferenceMapMapReferenceMapMapEntries, 12));
        Multimap nameReferenceGraphReferenceMap12 = ((Multimap) getFieldValue(nameReferenceGraph, "com.google.javascript.jscomp.NameReferenceGraph", "referenceMap"));
        ImmutableMap nameReferenceGraphReferenceMap12ReferenceMapMap = ((ImmutableMap) getFieldValue(nameReferenceGraphReferenceMap12, "com.google.common.collect.ImmutableMultimap", "map"));
        java.util.Map.Entry[] nameReferenceGraphReferenceMap12ReferenceMapMapReferenceMapMapEntries = ((java.util.Map.Entry[]) getFieldValue(nameReferenceGraphReferenceMap12ReferenceMapMap, "com.google.common.collect.ImmutableSortedMap", "entries"));
        Map.Entry finalNameReferenceGraphReferenceMapMapEntries13 = ((Map.Entry) get(nameReferenceGraphReferenceMap12ReferenceMapMapReferenceMapMapEntries, 13));
        Multimap nameReferenceGraphReferenceMap13 = ((Multimap) getFieldValue(nameReferenceGraph, "com.google.javascript.jscomp.NameReferenceGraph", "referenceMap"));
        ImmutableMap nameReferenceGraphReferenceMap13ReferenceMapMap = ((ImmutableMap) getFieldValue(nameReferenceGraphReferenceMap13, "com.google.common.collect.ImmutableMultimap", "map"));
        java.util.Map.Entry[] nameReferenceGraphReferenceMap13ReferenceMapMapReferenceMapMapEntries = ((java.util.Map.Entry[]) getFieldValue(nameReferenceGraphReferenceMap13ReferenceMapMap, "com.google.common.collect.ImmutableSortedMap", "entries"));
        Map.Entry finalNameReferenceGraphReferenceMapMapEntries14 = ((Map.Entry) get(nameReferenceGraphReferenceMap13ReferenceMapMapReferenceMapMapEntries, 14));
        Multimap nameReferenceGraphReferenceMap14 = ((Multimap) getFieldValue(nameReferenceGraph, "com.google.javascript.jscomp.NameReferenceGraph", "referenceMap"));
        ImmutableMap nameReferenceGraphReferenceMap14ReferenceMapMap = ((ImmutableMap) getFieldValue(nameReferenceGraphReferenceMap14, "com.google.common.collect.ImmutableMultimap", "map"));
        java.util.Map.Entry[] nameReferenceGraphReferenceMap14ReferenceMapMapReferenceMapMapEntries = ((java.util.Map.Entry[]) getFieldValue(nameReferenceGraphReferenceMap14ReferenceMapMap, "com.google.common.collect.ImmutableSortedMap", "entries"));
        Map.Entry finalNameReferenceGraphReferenceMapMapEntries15 = ((Map.Entry) get(nameReferenceGraphReferenceMap14ReferenceMapMapReferenceMapMapEntries, 15));
        Multimap nameReferenceGraphReferenceMap15 = ((Multimap) getFieldValue(nameReferenceGraph, "com.google.javascript.jscomp.NameReferenceGraph", "referenceMap"));
        ImmutableMap nameReferenceGraphReferenceMap15ReferenceMapMap = ((ImmutableMap) getFieldValue(nameReferenceGraphReferenceMap15, "com.google.common.collect.ImmutableMultimap", "map"));
        java.util.Map.Entry[] nameReferenceGraphReferenceMap15ReferenceMapMapReferenceMapMapEntries = ((java.util.Map.Entry[]) getFieldValue(nameReferenceGraphReferenceMap15ReferenceMapMap, "com.google.common.collect.ImmutableSortedMap", "entries"));
        Map.Entry finalNameReferenceGraphReferenceMapMapEntries16 = ((Map.Entry) get(nameReferenceGraphReferenceMap15ReferenceMapMapReferenceMapMapEntries, 16));
        
        assertNull(finalNameReferenceGraphReferenceMapMapEntries1);
        
        assertNull(finalNameReferenceGraphReferenceMapMapEntries2);
        
        assertNull(finalNameReferenceGraphReferenceMapMapEntries3);
        
        assertNull(finalNameReferenceGraphReferenceMapMapEntries4);
        
        assertNull(finalNameReferenceGraphReferenceMapMapEntries5);
        
        assertNull(finalNameReferenceGraphReferenceMapMapEntries6);
        
        assertNull(finalNameReferenceGraphReferenceMapMapEntries7);
        
        assertNull(finalNameReferenceGraphReferenceMapMapEntries8);
        
        assertNull(finalNameReferenceGraphReferenceMapMapEntries9);
        
        assertNull(finalNameReferenceGraphReferenceMapMapEntries10);
        
        assertNull(finalNameReferenceGraphReferenceMapMapEntries11);
        
        assertNull(finalNameReferenceGraphReferenceMapMapEntries12);
        
        assertNull(finalNameReferenceGraphReferenceMapMapEntries13);
        
        assertNull(finalNameReferenceGraphReferenceMapMapEntries14);
        
        assertNull(finalNameReferenceGraphReferenceMapMapEntries15);
        
        assertNull(finalNameReferenceGraphReferenceMapMapEntries16);
    }
    
    @Test
    public void testGetCallableDefinitions5() throws Exception  {
        SimpleDefinitionFinder simpleDefinitionFinder = ((SimpleDefinitionFinder) createInstance("com.google.javascript.jscomp.SimpleDefinitionFinder"));
        LinkedHashMap definitionSiteMap = new LinkedHashMap();
        setField(simpleDefinitionFinder, "com.google.javascript.jscomp.SimpleDefinitionFinder", "definitionSiteMap", definitionSiteMap);
        Object nameDefinitionMultimap = createInstance("com.google.common.collect.EmptyImmutableListMultimap");
        ImmutableSortedMap map = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        setField(map, "com.google.common.collect.ImmutableSortedMap", "toIndex", -2143289344);
        setField(nameDefinitionMultimap, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(simpleDefinitionFinder, "com.google.javascript.jscomp.SimpleDefinitionFinder", "nameDefinitionMultimap", nameDefinitionMultimap);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class simpleDefinitionFinderType = Class.forName("com.google.javascript.jscomp.DefinitionProvider");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCallableDefinitionsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("getCallableDefinitions", simpleDefinitionFinderType, stringNodeType);
        getCallableDefinitionsMethod.setAccessible(true);
        java.lang.Object[] getCallableDefinitionsMethodArguments = new java.lang.Object[2];
        getCallableDefinitionsMethodArguments[0] = simpleDefinitionFinder;
        getCallableDefinitionsMethodArguments[1] = stringNode;
        Collection actual = ((Collection) getCallableDefinitionsMethod.invoke(null, getCallableDefinitionsMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testGetCallableDefinitions6() throws Exception  {
        SimpleDefinitionFinder simpleDefinitionFinder = ((SimpleDefinitionFinder) createInstance("com.google.javascript.jscomp.SimpleDefinitionFinder"));
        LinkedHashMap definitionSiteMap = new LinkedHashMap();
        setField(simpleDefinitionFinder, "com.google.javascript.jscomp.SimpleDefinitionFinder", "definitionSiteMap", definitionSiteMap);
        Object nameDefinitionMultimap = createInstance("com.google.common.collect.EmptyImmutableListMultimap");
        ImmutableSortedMap map = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        java.util.Map.Entry[] entries = new java.util.Map.Entry[9];
        Object keyValueHolder = createInstance("java.util.KeyValueHolder");
        Object value = createInstance("com.google.common.collect.RegularImmutableList");
        java.lang.Object[] array = {null, null, null, null, null, null, null, null, null};
        setField(value, "com.google.common.collect.RegularImmutableList", "array", array);
        setField(keyValueHolder, "java.util.KeyValueHolder", "value", value);
        entries[0] = ((Map.Entry) keyValueHolder);
        setField(map, "com.google.common.collect.ImmutableSortedMap", "entries", entries);
        setField(map, "com.google.common.collect.ImmutableSortedMap", "fromIndex", -1);
        setField(map, "com.google.common.collect.ImmutableSortedMap", "toIndex", -2147483647);
        setField(nameDefinitionMultimap, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(simpleDefinitionFinder, "com.google.javascript.jscomp.SimpleDefinitionFinder", "nameDefinitionMultimap", nameDefinitionMultimap);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class simpleDefinitionFinderType = Class.forName("com.google.javascript.jscomp.DefinitionProvider");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCallableDefinitionsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("getCallableDefinitions", simpleDefinitionFinderType, stringNodeType);
        getCallableDefinitionsMethod.setAccessible(true);
        java.lang.Object[] getCallableDefinitionsMethodArguments = new java.lang.Object[2];
        getCallableDefinitionsMethodArguments[0] = simpleDefinitionFinder;
        getCallableDefinitionsMethodArguments[1] = stringNode;
        ArrayList actual = ((ArrayList) getCallableDefinitionsMethod.invoke(null, getCallableDefinitionsMethodArguments));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
        
        Multimap simpleDefinitionFinderNameDefinitionMultimap = ((Multimap) getFieldValue(simpleDefinitionFinder, "com.google.javascript.jscomp.SimpleDefinitionFinder", "nameDefinitionMultimap"));
        ImmutableMap simpleDefinitionFinderNameDefinitionMultimapNameDefinitionMultimapMap = ((ImmutableMap) getFieldValue(simpleDefinitionFinderNameDefinitionMultimap, "com.google.common.collect.ImmutableMultimap", "map"));
        java.util.Map.Entry[] simpleDefinitionFinderNameDefinitionMultimapNameDefinitionMultimapMapNameDefinitionMultimapMapEntries = ((java.util.Map.Entry[]) getFieldValue(simpleDefinitionFinderNameDefinitionMultimapNameDefinitionMultimapMap, "com.google.common.collect.ImmutableSortedMap", "entries"));
        Map.Entry finalSimpleDefinitionFinderNameDefinitionMultimapMapEntries1 = ((Map.Entry) get(simpleDefinitionFinderNameDefinitionMultimapNameDefinitionMultimapMapNameDefinitionMultimapMapEntries, 1));
        Multimap simpleDefinitionFinderNameDefinitionMultimap1 = ((Multimap) getFieldValue(simpleDefinitionFinder, "com.google.javascript.jscomp.SimpleDefinitionFinder", "nameDefinitionMultimap"));
        ImmutableMap simpleDefinitionFinderNameDefinitionMultimap1NameDefinitionMultimapMap = ((ImmutableMap) getFieldValue(simpleDefinitionFinderNameDefinitionMultimap1, "com.google.common.collect.ImmutableMultimap", "map"));
        java.util.Map.Entry[] simpleDefinitionFinderNameDefinitionMultimap1NameDefinitionMultimapMapNameDefinitionMultimapMapEntries = ((java.util.Map.Entry[]) getFieldValue(simpleDefinitionFinderNameDefinitionMultimap1NameDefinitionMultimapMap, "com.google.common.collect.ImmutableSortedMap", "entries"));
        Map.Entry finalSimpleDefinitionFinderNameDefinitionMultimapMapEntries2 = ((Map.Entry) get(simpleDefinitionFinderNameDefinitionMultimap1NameDefinitionMultimapMapNameDefinitionMultimapMapEntries, 2));
        Multimap simpleDefinitionFinderNameDefinitionMultimap2 = ((Multimap) getFieldValue(simpleDefinitionFinder, "com.google.javascript.jscomp.SimpleDefinitionFinder", "nameDefinitionMultimap"));
        ImmutableMap simpleDefinitionFinderNameDefinitionMultimap2NameDefinitionMultimapMap = ((ImmutableMap) getFieldValue(simpleDefinitionFinderNameDefinitionMultimap2, "com.google.common.collect.ImmutableMultimap", "map"));
        java.util.Map.Entry[] simpleDefinitionFinderNameDefinitionMultimap2NameDefinitionMultimapMapNameDefinitionMultimapMapEntries = ((java.util.Map.Entry[]) getFieldValue(simpleDefinitionFinderNameDefinitionMultimap2NameDefinitionMultimapMap, "com.google.common.collect.ImmutableSortedMap", "entries"));
        Map.Entry finalSimpleDefinitionFinderNameDefinitionMultimapMapEntries3 = ((Map.Entry) get(simpleDefinitionFinderNameDefinitionMultimap2NameDefinitionMultimapMapNameDefinitionMultimapMapEntries, 3));
        Multimap simpleDefinitionFinderNameDefinitionMultimap3 = ((Multimap) getFieldValue(simpleDefinitionFinder, "com.google.javascript.jscomp.SimpleDefinitionFinder", "nameDefinitionMultimap"));
        ImmutableMap simpleDefinitionFinderNameDefinitionMultimap3NameDefinitionMultimapMap = ((ImmutableMap) getFieldValue(simpleDefinitionFinderNameDefinitionMultimap3, "com.google.common.collect.ImmutableMultimap", "map"));
        java.util.Map.Entry[] simpleDefinitionFinderNameDefinitionMultimap3NameDefinitionMultimapMapNameDefinitionMultimapMapEntries = ((java.util.Map.Entry[]) getFieldValue(simpleDefinitionFinderNameDefinitionMultimap3NameDefinitionMultimapMap, "com.google.common.collect.ImmutableSortedMap", "entries"));
        Map.Entry finalSimpleDefinitionFinderNameDefinitionMultimapMapEntries4 = ((Map.Entry) get(simpleDefinitionFinderNameDefinitionMultimap3NameDefinitionMultimapMapNameDefinitionMultimapMapEntries, 4));
        Multimap simpleDefinitionFinderNameDefinitionMultimap4 = ((Multimap) getFieldValue(simpleDefinitionFinder, "com.google.javascript.jscomp.SimpleDefinitionFinder", "nameDefinitionMultimap"));
        ImmutableMap simpleDefinitionFinderNameDefinitionMultimap4NameDefinitionMultimapMap = ((ImmutableMap) getFieldValue(simpleDefinitionFinderNameDefinitionMultimap4, "com.google.common.collect.ImmutableMultimap", "map"));
        java.util.Map.Entry[] simpleDefinitionFinderNameDefinitionMultimap4NameDefinitionMultimapMapNameDefinitionMultimapMapEntries = ((java.util.Map.Entry[]) getFieldValue(simpleDefinitionFinderNameDefinitionMultimap4NameDefinitionMultimapMap, "com.google.common.collect.ImmutableSortedMap", "entries"));
        Map.Entry finalSimpleDefinitionFinderNameDefinitionMultimapMapEntries5 = ((Map.Entry) get(simpleDefinitionFinderNameDefinitionMultimap4NameDefinitionMultimapMapNameDefinitionMultimapMapEntries, 5));
        Multimap simpleDefinitionFinderNameDefinitionMultimap5 = ((Multimap) getFieldValue(simpleDefinitionFinder, "com.google.javascript.jscomp.SimpleDefinitionFinder", "nameDefinitionMultimap"));
        ImmutableMap simpleDefinitionFinderNameDefinitionMultimap5NameDefinitionMultimapMap = ((ImmutableMap) getFieldValue(simpleDefinitionFinderNameDefinitionMultimap5, "com.google.common.collect.ImmutableMultimap", "map"));
        java.util.Map.Entry[] simpleDefinitionFinderNameDefinitionMultimap5NameDefinitionMultimapMapNameDefinitionMultimapMapEntries = ((java.util.Map.Entry[]) getFieldValue(simpleDefinitionFinderNameDefinitionMultimap5NameDefinitionMultimapMap, "com.google.common.collect.ImmutableSortedMap", "entries"));
        Map.Entry finalSimpleDefinitionFinderNameDefinitionMultimapMapEntries6 = ((Map.Entry) get(simpleDefinitionFinderNameDefinitionMultimap5NameDefinitionMultimapMapNameDefinitionMultimapMapEntries, 6));
        Multimap simpleDefinitionFinderNameDefinitionMultimap6 = ((Multimap) getFieldValue(simpleDefinitionFinder, "com.google.javascript.jscomp.SimpleDefinitionFinder", "nameDefinitionMultimap"));
        ImmutableMap simpleDefinitionFinderNameDefinitionMultimap6NameDefinitionMultimapMap = ((ImmutableMap) getFieldValue(simpleDefinitionFinderNameDefinitionMultimap6, "com.google.common.collect.ImmutableMultimap", "map"));
        java.util.Map.Entry[] simpleDefinitionFinderNameDefinitionMultimap6NameDefinitionMultimapMapNameDefinitionMultimapMapEntries = ((java.util.Map.Entry[]) getFieldValue(simpleDefinitionFinderNameDefinitionMultimap6NameDefinitionMultimapMap, "com.google.common.collect.ImmutableSortedMap", "entries"));
        Map.Entry finalSimpleDefinitionFinderNameDefinitionMultimapMapEntries7 = ((Map.Entry) get(simpleDefinitionFinderNameDefinitionMultimap6NameDefinitionMultimapMapNameDefinitionMultimapMapEntries, 7));
        Multimap simpleDefinitionFinderNameDefinitionMultimap7 = ((Multimap) getFieldValue(simpleDefinitionFinder, "com.google.javascript.jscomp.SimpleDefinitionFinder", "nameDefinitionMultimap"));
        ImmutableMap simpleDefinitionFinderNameDefinitionMultimap7NameDefinitionMultimapMap = ((ImmutableMap) getFieldValue(simpleDefinitionFinderNameDefinitionMultimap7, "com.google.common.collect.ImmutableMultimap", "map"));
        java.util.Map.Entry[] simpleDefinitionFinderNameDefinitionMultimap7NameDefinitionMultimapMapNameDefinitionMultimapMapEntries = ((java.util.Map.Entry[]) getFieldValue(simpleDefinitionFinderNameDefinitionMultimap7NameDefinitionMultimapMap, "com.google.common.collect.ImmutableSortedMap", "entries"));
        Map.Entry finalSimpleDefinitionFinderNameDefinitionMultimapMapEntries8 = ((Map.Entry) get(simpleDefinitionFinderNameDefinitionMultimap7NameDefinitionMultimapMapNameDefinitionMultimapMapEntries, 8));
        
        assertNull(finalSimpleDefinitionFinderNameDefinitionMultimapMapEntries1);
        
        assertNull(finalSimpleDefinitionFinderNameDefinitionMultimapMapEntries2);
        
        assertNull(finalSimpleDefinitionFinderNameDefinitionMultimapMapEntries3);
        
        assertNull(finalSimpleDefinitionFinderNameDefinitionMultimapMapEntries4);
        
        assertNull(finalSimpleDefinitionFinderNameDefinitionMultimapMapEntries5);
        
        assertNull(finalSimpleDefinitionFinderNameDefinitionMultimapMapEntries6);
        
        assertNull(finalSimpleDefinitionFinderNameDefinitionMultimapMapEntries7);
        
        assertNull(finalSimpleDefinitionFinderNameDefinitionMultimapMapEntries8);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getCallableDefinitions(com.google.javascript.jscomp.DefinitionProvider, com.google.javascript.rhino.Node)
    
    @Test
    public void testGetCallableDefinitions7() throws Throwable  {
        NameReferenceGraph nameReferenceGraph = ((NameReferenceGraph) createInstance("com.google.javascript.jscomp.NameReferenceGraph"));
        Object referenceMap = createInstance("com.google.common.collect.Multimaps$UnmodifiableListMultimap");
        Object delegate = createInstance("com.google.common.collect.Multimaps$UnmodifiableSetMultimap");
        setField(referenceMap, "com.google.common.collect.Multimaps$UnmodifiableMultimap", "delegate", delegate);
        setField(nameReferenceGraph, "com.google.javascript.jscomp.NameReferenceGraph", "referenceMap", referenceMap);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        
        /* This test fails because method [com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions] produces [java.lang.ClassCastException: class com.google.common.collect.Multimaps$UnmodifiableSetMultimap cannot be cast to class com.google.common.collect.ListMultimap (com.google.common.collect.Multimaps$UnmodifiableSetMultimap and com.google.common.collect.ListMultimap are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            com.google.common.collect.Multimaps$UnmodifiableListMultimap.delegate(Multimaps.java:621)
            com.google.common.collect.Multimaps$UnmodifiableListMultimap.get(Multimaps.java:624)
            com.google.common.collect.Multimaps$UnmodifiableListMultimap.get(Multimaps.java:615)
            com.google.javascript.jscomp.NameReferenceGraph.getReferencesAt(NameReferenceGraph.java:125)
            com.google.javascript.jscomp.NameReferenceGraph.getDefinitionsReferencedAt(NameReferenceGraph.java:134)
            com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions(PureFunctionIdentifier.java:183) */
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class nameReferenceGraphType = Class.forName("com.google.javascript.jscomp.DefinitionProvider");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCallableDefinitionsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("getCallableDefinitions", nameReferenceGraphType, stringNodeType);
        getCallableDefinitionsMethod.setAccessible(true);
        java.lang.Object[] getCallableDefinitionsMethodArguments = new java.lang.Object[2];
        getCallableDefinitionsMethodArguments[0] = nameReferenceGraph;
        getCallableDefinitionsMethodArguments[1] = stringNode;
        try {
            getCallableDefinitionsMethod.invoke(null, getCallableDefinitionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCallableDefinitions8() throws Throwable  {
        NameReferenceGraph nameReferenceGraph = ((NameReferenceGraph) createInstance("com.google.javascript.jscomp.NameReferenceGraph"));
        Object referenceMap = createInstance("com.google.common.collect.Multimaps$UnmodifiableListMultimap");
        ImmutableListMultimap delegate = ((ImmutableListMultimap) createInstance("com.google.common.collect.ImmutableListMultimap"));
        ImmutableSortedMap map = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        java.util.Map.Entry[] entries = new java.util.Map.Entry[9];
        Object keyValueHolder = createInstance("java.util.KeyValueHolder");
        Object value = createInstance("java.lang.Object");
        setField(keyValueHolder, "java.util.KeyValueHolder", "value", value);
        entries[0] = ((Map.Entry) keyValueHolder);
        setField(map, "com.google.common.collect.ImmutableSortedMap", "entries", entries);
        setField(map, "com.google.common.collect.ImmutableSortedMap", "fromIndex", -1);
        setField(map, "com.google.common.collect.ImmutableSortedMap", "toIndex", -2147483647);
        setField(delegate, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(referenceMap, "com.google.common.collect.Multimaps$UnmodifiableMultimap", "delegate", delegate);
        setField(nameReferenceGraph, "com.google.javascript.jscomp.NameReferenceGraph", "referenceMap", referenceMap);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        
        /* This test fails because method [com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class com.google.common.collect.ImmutableList (java.lang.Object is in module java.base of loader 'bootstrap'; com.google.common.collect.ImmutableList is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            com.google.common.collect.ImmutableListMultimap.get(ImmutableListMultimap.java:266)
            com.google.common.collect.ImmutableListMultimap.get(ImmutableListMultimap.java:49)
            com.google.common.collect.Multimaps$UnmodifiableListMultimap.get(Multimaps.java:624)
            com.google.common.collect.Multimaps$UnmodifiableListMultimap.get(Multimaps.java:615)
            com.google.javascript.jscomp.NameReferenceGraph.getReferencesAt(NameReferenceGraph.java:125)
            com.google.javascript.jscomp.NameReferenceGraph.getDefinitionsReferencedAt(NameReferenceGraph.java:134)
            com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions(PureFunctionIdentifier.java:183) */
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class nameReferenceGraphType = Class.forName("com.google.javascript.jscomp.DefinitionProvider");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCallableDefinitionsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("getCallableDefinitions", nameReferenceGraphType, stringNodeType);
        getCallableDefinitionsMethod.setAccessible(true);
        java.lang.Object[] getCallableDefinitionsMethodArguments = new java.lang.Object[2];
        getCallableDefinitionsMethodArguments[0] = nameReferenceGraph;
        getCallableDefinitionsMethodArguments[1] = stringNode;
        try {
            getCallableDefinitionsMethod.invoke(null, getCallableDefinitionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCallableDefinitions9() throws Throwable  {
        NameReferenceGraph nameReferenceGraph = ((NameReferenceGraph) createInstance("com.google.javascript.jscomp.NameReferenceGraph"));
        ImmutableListMultimap referenceMap = ((ImmutableListMultimap) createInstance("com.google.common.collect.ImmutableListMultimap"));
        ImmutableSortedMap map = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        java.util.Map.Entry[] entries = new java.util.Map.Entry[9];
        Object attributeEntry = createInstance("java.text.AttributeEntry");
        entries[8] = ((Map.Entry) attributeEntry);
        setField(map, "com.google.common.collect.ImmutableSortedMap", "entries", entries);
        EqualComparator comparator = ((EqualComparator) createInstance("org.apache.tools.ant.types.selectors.modifiedselector.EqualComparator"));
        setField(map, "com.google.common.collect.ImmutableSortedMap", "comparator", comparator);
        setField(map, "com.google.common.collect.ImmutableSortedMap", "toIndex", 18);
        setField(referenceMap, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(nameReferenceGraph, "com.google.javascript.jscomp.NameReferenceGraph", "referenceMap", referenceMap);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        
        /* This test fails because method [com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions] produces [java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 9]
            com.google.common.collect.ImmutableSortedMap.binarySearch(ImmutableSortedMap.java:418)
            com.google.common.collect.ImmutableSortedMap.get(ImmutableSortedMap.java:405)
            com.google.common.collect.ImmutableListMultimap.get(ImmutableListMultimap.java:266)
            com.google.common.collect.ImmutableListMultimap.get(ImmutableListMultimap.java:49)
            com.google.javascript.jscomp.NameReferenceGraph.getReferencesAt(NameReferenceGraph.java:125)
            com.google.javascript.jscomp.NameReferenceGraph.getDefinitionsReferencedAt(NameReferenceGraph.java:134)
            com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions(PureFunctionIdentifier.java:183) */
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class nameReferenceGraphType = Class.forName("com.google.javascript.jscomp.DefinitionProvider");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCallableDefinitionsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("getCallableDefinitions", nameReferenceGraphType, stringNodeType);
        getCallableDefinitionsMethod.setAccessible(true);
        java.lang.Object[] getCallableDefinitionsMethodArguments = new java.lang.Object[2];
        getCallableDefinitionsMethodArguments[0] = nameReferenceGraph;
        getCallableDefinitionsMethodArguments[1] = stringNode;
        try {
            getCallableDefinitionsMethod.invoke(null, getCallableDefinitionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCallableDefinitions10() throws Throwable  {
        SimpleDefinitionFinder simpleDefinitionFinder = ((SimpleDefinitionFinder) createInstance("com.google.javascript.jscomp.SimpleDefinitionFinder"));
        LinkedHashMap definitionSiteMap = new LinkedHashMap();
        setField(simpleDefinitionFinder, "com.google.javascript.jscomp.SimpleDefinitionFinder", "definitionSiteMap", definitionSiteMap);
        Object nameDefinitionMultimap = createInstance("com.google.common.collect.EmptyImmutableListMultimap");
        ImmutableSortedMap map = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        java.util.Map.Entry[] entries = {null, null, null, null, null, null, null, null, null};
        setField(map, "com.google.common.collect.ImmutableSortedMap", "entries", entries);
        setField(map, "com.google.common.collect.ImmutableSortedMap", "fromIndex", Integer.MIN_VALUE);
        setField(map, "com.google.common.collect.ImmutableSortedMap", "toIndex", 1);
        setField(nameDefinitionMultimap, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(simpleDefinitionFinder, "com.google.javascript.jscomp.SimpleDefinitionFinder", "nameDefinitionMultimap", nameDefinitionMultimap);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 9]
            com.google.common.collect.ImmutableSortedMap.binarySearch(ImmutableSortedMap.java:418)
            com.google.common.collect.ImmutableSortedMap.get(ImmutableSortedMap.java:405)
            com.google.common.collect.ImmutableListMultimap.get(ImmutableListMultimap.java:266)
            com.google.common.collect.ImmutableListMultimap.get(ImmutableListMultimap.java:49)
            com.google.javascript.jscomp.SimpleDefinitionFinder.getDefinitionsReferencedAt(SimpleDefinitionFinder.java:82)
            com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions(PureFunctionIdentifier.java:183) */
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class simpleDefinitionFinderType = Class.forName("com.google.javascript.jscomp.DefinitionProvider");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCallableDefinitionsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("getCallableDefinitions", simpleDefinitionFinderType, stringNodeType);
        getCallableDefinitionsMethod.setAccessible(true);
        java.lang.Object[] getCallableDefinitionsMethodArguments = new java.lang.Object[2];
        getCallableDefinitionsMethodArguments[0] = simpleDefinitionFinder;
        getCallableDefinitionsMethodArguments[1] = stringNode;
        try {
            getCallableDefinitionsMethod.invoke(null, getCallableDefinitionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCallableDefinitions11() throws Throwable  {
        NameReferenceGraph nameReferenceGraph = ((NameReferenceGraph) createInstance("com.google.javascript.jscomp.NameReferenceGraph"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NameReferenceGraph.getReferencesAt(NameReferenceGraph.java:125)
            com.google.javascript.jscomp.NameReferenceGraph.getDefinitionsReferencedAt(NameReferenceGraph.java:134)
            com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions(PureFunctionIdentifier.java:183) */
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class nameReferenceGraphType = Class.forName("com.google.javascript.jscomp.DefinitionProvider");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCallableDefinitionsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("getCallableDefinitions", nameReferenceGraphType, stringNodeType);
        getCallableDefinitionsMethod.setAccessible(true);
        java.lang.Object[] getCallableDefinitionsMethodArguments = new java.lang.Object[2];
        getCallableDefinitionsMethodArguments[0] = nameReferenceGraph;
        getCallableDefinitionsMethodArguments[1] = stringNode;
        try {
            getCallableDefinitionsMethod.invoke(null, getCallableDefinitionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCallableDefinitions12() throws Throwable  {
        NameReferenceGraph nameReferenceGraph = ((NameReferenceGraph) createInstance("com.google.javascript.jscomp.NameReferenceGraph"));
        Object referenceMap = createInstance("com.google.common.collect.EmptyImmutableListMultimap");
        ImmutableSortedMap map = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        java.util.Map.Entry[] entries = new java.util.Map.Entry[9];
        Object attributeEntry = createInstance("java.text.AttributeEntry");
        Object value = createInstance("com.google.common.collect.SingletonImmutableList");
        setField(attributeEntry, "java.text.AttributeEntry", "value", value);
        entries[0] = ((Map.Entry) attributeEntry);
        setField(map, "com.google.common.collect.ImmutableSortedMap", "entries", entries);
        setField(map, "com.google.common.collect.ImmutableSortedMap", "fromIndex", -1);
        setField(map, "com.google.common.collect.ImmutableSortedMap", "toIndex", -2147483520);
        setField(referenceMap, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(nameReferenceGraph, "com.google.javascript.jscomp.NameReferenceGraph", "referenceMap", referenceMap);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        
        /* This test fails because method [com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NameReferenceGraph.getReferencesAt(NameReferenceGraph.java:126)
            com.google.javascript.jscomp.NameReferenceGraph.getDefinitionsReferencedAt(NameReferenceGraph.java:134)
            com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions(PureFunctionIdentifier.java:183) */
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class nameReferenceGraphType = Class.forName("com.google.javascript.jscomp.DefinitionProvider");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCallableDefinitionsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("getCallableDefinitions", nameReferenceGraphType, stringNodeType);
        getCallableDefinitionsMethod.setAccessible(true);
        java.lang.Object[] getCallableDefinitionsMethodArguments = new java.lang.Object[2];
        getCallableDefinitionsMethodArguments[0] = nameReferenceGraph;
        getCallableDefinitionsMethodArguments[1] = stringNode;
        try {
            getCallableDefinitionsMethod.invoke(null, getCallableDefinitionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCallableDefinitions13() throws Throwable  {
        NameReferenceGraph nameReferenceGraph = ((NameReferenceGraph) createInstance("com.google.javascript.jscomp.NameReferenceGraph"));
        Object referenceMap = createInstance("com.google.common.collect.EmptyImmutableListMultimap");
        ImmutableSortedMap map = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        java.util.Map.Entry[] entries = new java.util.Map.Entry[9];
        Object attributeEntry = createInstance("java.text.AttributeEntry");
        Object value = createInstance("com.google.common.collect.ImmutableSortedAsList");
        setField(value, "com.google.common.collect.RegularImmutableList", "offset", 10);
        setField(value, "com.google.common.collect.RegularImmutableList", "size", 23);
        java.lang.Object[] array = new java.lang.Object[34];
        setField(value, "com.google.common.collect.RegularImmutableList", "array", array);
        setField(attributeEntry, "java.text.AttributeEntry", "value", value);
        entries[0] = ((Map.Entry) attributeEntry);
        setField(map, "com.google.common.collect.ImmutableSortedMap", "entries", entries);
        setField(map, "com.google.common.collect.ImmutableSortedMap", "fromIndex", -1);
        setField(map, "com.google.common.collect.ImmutableSortedMap", "toIndex", -2147483520);
        setField(referenceMap, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(nameReferenceGraph, "com.google.javascript.jscomp.NameReferenceGraph", "referenceMap", referenceMap);
        Node node = new Node(33);
        
        /* This test fails because method [com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NameReferenceGraph.getReferencesAt(NameReferenceGraph.java:126)
            com.google.javascript.jscomp.NameReferenceGraph.getDefinitionsReferencedAt(NameReferenceGraph.java:134)
            com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions(PureFunctionIdentifier.java:183) */
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class nameReferenceGraphType = Class.forName("com.google.javascript.jscomp.DefinitionProvider");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCallableDefinitionsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("getCallableDefinitions", nameReferenceGraphType, nodeType);
        getCallableDefinitionsMethod.setAccessible(true);
        java.lang.Object[] getCallableDefinitionsMethodArguments = new java.lang.Object[2];
        getCallableDefinitionsMethodArguments[0] = nameReferenceGraph;
        getCallableDefinitionsMethodArguments[1] = node;
        try {
            getCallableDefinitionsMethod.invoke(null, getCallableDefinitionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCallableDefinitions14() throws Throwable  {
        SimpleDefinitionFinder simpleDefinitionFinder = ((SimpleDefinitionFinder) createInstance("com.google.javascript.jscomp.SimpleDefinitionFinder"));
        LinkedHashMap definitionSiteMap = new LinkedHashMap();
        setField(simpleDefinitionFinder, "com.google.javascript.jscomp.SimpleDefinitionFinder", "definitionSiteMap", definitionSiteMap);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SimpleDefinitionFinder.getDefinitionsReferencedAt(SimpleDefinitionFinder.java:82)
            com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions(PureFunctionIdentifier.java:183) */
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class simpleDefinitionFinderType = Class.forName("com.google.javascript.jscomp.DefinitionProvider");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCallableDefinitionsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("getCallableDefinitions", simpleDefinitionFinderType, stringNodeType);
        getCallableDefinitionsMethod.setAccessible(true);
        java.lang.Object[] getCallableDefinitionsMethodArguments = new java.lang.Object[2];
        getCallableDefinitionsMethodArguments[0] = simpleDefinitionFinder;
        getCallableDefinitionsMethodArguments[1] = stringNode;
        try {
            getCallableDefinitionsMethod.invoke(null, getCallableDefinitionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCallableDefinitions15() throws Throwable  {
        SimpleDefinitionFinder simpleDefinitionFinder = ((SimpleDefinitionFinder) createInstance("com.google.javascript.jscomp.SimpleDefinitionFinder"));
        LinkedHashMap definitionSiteMap = new LinkedHashMap();
        DefinitionSite definitionSite = ((DefinitionSite) createInstance("com.google.javascript.jscomp.DefinitionSite"));
        definitionSiteMap.put(null, definitionSite);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        definitionSiteMap.put(node, definitionSite);
        setField(simpleDefinitionFinder, "com.google.javascript.jscomp.SimpleDefinitionFinder", "definitionSiteMap", definitionSiteMap);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        
        /* This test fails because method [com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SimpleDefinitionFinder.getDefinitionsReferencedAt(SimpleDefinitionFinder.java:74)
            com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions(PureFunctionIdentifier.java:183) */
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class simpleDefinitionFinderType = Class.forName("com.google.javascript.jscomp.DefinitionProvider");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCallableDefinitionsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("getCallableDefinitions", simpleDefinitionFinderType, stringNodeType);
        getCallableDefinitionsMethod.setAccessible(true);
        java.lang.Object[] getCallableDefinitionsMethodArguments = new java.lang.Object[2];
        getCallableDefinitionsMethodArguments[0] = simpleDefinitionFinder;
        getCallableDefinitionsMethodArguments[1] = stringNode;
        try {
            getCallableDefinitionsMethod.invoke(null, getCallableDefinitionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getCallableDefinitions(com.google.javascript.jscomp.DefinitionProvider, com.google.javascript.rhino.Node)
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetCallableDefinitions16() throws Throwable  {
        NameReferenceGraph nameReferenceGraph = ((NameReferenceGraph) createInstance("com.google.javascript.jscomp.NameReferenceGraph"));
        Object referenceMap = createInstance("com.google.common.collect.EmptyImmutableListMultimap");
        ImmutableSortedMap map = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        java.util.Map.Entry[] entries = new java.util.Map.Entry[9];
        Object attributeEntry = createInstance("java.text.AttributeEntry");
        Object value = createInstance("com.google.common.collect.ImmutableSortedAsList");
        setField(value, "com.google.common.collect.RegularImmutableList", "offset", Integer.MIN_VALUE);
        setField(value, "com.google.common.collect.RegularImmutableList", "array", entries);
        setField(attributeEntry, "java.text.AttributeEntry", "value", value);
        entries[0] = ((Map.Entry) attributeEntry);
        setField(map, "com.google.common.collect.ImmutableSortedMap", "entries", entries);
        setField(map, "com.google.common.collect.ImmutableSortedMap", "fromIndex", -1);
        setField(map, "com.google.common.collect.ImmutableSortedMap", "toIndex", -2147483520);
        setField(referenceMap, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(nameReferenceGraph, "com.google.javascript.jscomp.NameReferenceGraph", "referenceMap", referenceMap);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class nameReferenceGraphType = Class.forName("com.google.javascript.jscomp.DefinitionProvider");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCallableDefinitionsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("getCallableDefinitions", nameReferenceGraphType, stringNodeType);
        getCallableDefinitionsMethod.setAccessible(true);
        java.lang.Object[] getCallableDefinitionsMethodArguments = new java.lang.Object[2];
        getCallableDefinitionsMethodArguments[0] = nameReferenceGraph;
        getCallableDefinitionsMethodArguments[1] = stringNode;
        try {
            getCallableDefinitionsMethod.invoke(null, getCallableDefinitionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for getCallableDefinitions
    
    public void testGetCallableDefinitions_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PureFunctionIdentifier.markPureFunctionCalls
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method markPureFunctionCalls()
    
    /**
    @utbot.classUnderTest {@link PureFunctionIdentifier}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier#markPureFunctionCalls()}
 *  */
    @Test
    public void testMarkPureFunctionCalls() throws Exception  {
        PureFunctionIdentifier pureFunctionIdentifier = ((PureFunctionIdentifier) createInstance("com.google.javascript.jscomp.PureFunctionIdentifier"));
        ArrayList allFunctionCalls = new ArrayList();
        setField(pureFunctionIdentifier, "com.google.javascript.jscomp.PureFunctionIdentifier", "allFunctionCalls", allFunctionCalls);
        
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Method markPureFunctionCallsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("markPureFunctionCalls");
        markPureFunctionCallsMethod.setAccessible(true);
        java.lang.Object[] markPureFunctionCallsMethodArguments = new java.lang.Object[0];
        markPureFunctionCallsMethod.invoke(pureFunctionIdentifier, markPureFunctionCallsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PureFunctionIdentifier}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier#markPureFunctionCalls()}
 *  */
    @Test
    public void testMarkPureFunctionCalls_1() throws Exception  {
        PureFunctionIdentifier pureFunctionIdentifier = ((PureFunctionIdentifier) createInstance("com.google.javascript.jscomp.PureFunctionIdentifier"));
        SimpleDefinitionFinder definitionProvider = ((SimpleDefinitionFinder) createInstance("com.google.javascript.jscomp.SimpleDefinitionFinder"));
        setField(pureFunctionIdentifier, "com.google.javascript.jscomp.PureFunctionIdentifier", "definitionProvider", definitionProvider);
        ArrayList allFunctionCalls = new ArrayList();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        allFunctionCalls.add(functionNode);
        setField(pureFunctionIdentifier, "com.google.javascript.jscomp.PureFunctionIdentifier", "allFunctionCalls", allFunctionCalls);
        
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Method markPureFunctionCallsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("markPureFunctionCalls");
        markPureFunctionCallsMethod.setAccessible(true);
        java.lang.Object[] markPureFunctionCallsMethodArguments = new java.lang.Object[0];
        markPureFunctionCallsMethod.invoke(pureFunctionIdentifier, markPureFunctionCallsMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method markPureFunctionCalls()
    
    /**
    @utbot.classUnderTest {@link PureFunctionIdentifier}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier#markPureFunctionCalls()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node callNode: allFunctionCalls)
 *  */
    @Test
    public void testMarkPureFunctionCalls_ThrowNullPointerException() throws Throwable  {
        PureFunctionIdentifier pureFunctionIdentifier = ((PureFunctionIdentifier) createInstance("com.google.javascript.jscomp.PureFunctionIdentifier"));
        
        /* This test fails because method [com.google.javascript.jscomp.PureFunctionIdentifier.markPureFunctionCalls] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PureFunctionIdentifier.markPureFunctionCalls(PureFunctionIdentifier.java:262) */
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Method markPureFunctionCallsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("markPureFunctionCalls");
        markPureFunctionCallsMethod.setAccessible(true);
        java.lang.Object[] markPureFunctionCallsMethodArguments = new java.lang.Object[0];
        try {
            markPureFunctionCallsMethod.invoke(pureFunctionIdentifier, markPureFunctionCallsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PureFunctionIdentifier}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier#markPureFunctionCalls()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node name = callNode.getFirstChild();
 *  */
    @Test
    public void testMarkPureFunctionCalls_ThrowNullPointerException_1() throws Throwable  {
        PureFunctionIdentifier pureFunctionIdentifier = ((PureFunctionIdentifier) createInstance("com.google.javascript.jscomp.PureFunctionIdentifier"));
        ArrayList allFunctionCalls = new ArrayList();
        allFunctionCalls.add(null);
        allFunctionCalls.add(null);
        allFunctionCalls.add(null);
        allFunctionCalls.add(null);
        allFunctionCalls.add(null);
        allFunctionCalls.add(null);
        allFunctionCalls.add(null);
        allFunctionCalls.add(null);
        allFunctionCalls.add(null);
        allFunctionCalls.add(null);
        setField(pureFunctionIdentifier, "com.google.javascript.jscomp.PureFunctionIdentifier", "allFunctionCalls", allFunctionCalls);
        
        /* This test fails because method [com.google.javascript.jscomp.PureFunctionIdentifier.markPureFunctionCalls] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PureFunctionIdentifier.markPureFunctionCalls(PureFunctionIdentifier.java:263) */
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Method markPureFunctionCallsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("markPureFunctionCalls");
        markPureFunctionCallsMethod.setAccessible(true);
        java.lang.Object[] markPureFunctionCallsMethodArguments = new java.lang.Object[0];
        try {
            markPureFunctionCallsMethod.invoke(pureFunctionIdentifier, markPureFunctionCallsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PureFunctionIdentifier}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier#markPureFunctionCalls()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getCallableDefinitions(definitionProvider, name)
 *  */
    @Test
    public void testMarkPureFunctionCalls_ThrowNullPointerException_2() throws Throwable  {
        PureFunctionIdentifier pureFunctionIdentifier = ((PureFunctionIdentifier) createInstance("com.google.javascript.jscomp.PureFunctionIdentifier"));
        ArrayList allFunctionCalls = new ArrayList();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        allFunctionCalls.add(functionNode);
        allFunctionCalls.add(null);
        allFunctionCalls.add(null);
        allFunctionCalls.add(null);
        allFunctionCalls.add(null);
        allFunctionCalls.add(null);
        allFunctionCalls.add(null);
        allFunctionCalls.add(null);
        allFunctionCalls.add(null);
        allFunctionCalls.add(null);
        setField(pureFunctionIdentifier, "com.google.javascript.jscomp.PureFunctionIdentifier", "allFunctionCalls", allFunctionCalls);
        
        /* This test fails because method [com.google.javascript.jscomp.PureFunctionIdentifier.markPureFunctionCalls] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions(PureFunctionIdentifier.java:183)
            com.google.javascript.jscomp.PureFunctionIdentifier.markPureFunctionCalls(PureFunctionIdentifier.java:265) */
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Method markPureFunctionCallsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("markPureFunctionCalls");
        markPureFunctionCallsMethod.setAccessible(true);
        java.lang.Object[] markPureFunctionCallsMethodArguments = new java.lang.Object[0];
        try {
            markPureFunctionCallsMethod.invoke(pureFunctionIdentifier, markPureFunctionCallsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method markPureFunctionCalls()
    
    /**
    @utbot.classUnderTest {@link PureFunctionIdentifier}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier#markPureFunctionCalls()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: getCallableDefinitions(definitionProvider, name)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testMarkPureFunctionCalls_ThrowIllegalStateException() throws Throwable  {
        PureFunctionIdentifier pureFunctionIdentifier = ((PureFunctionIdentifier) createInstance("com.google.javascript.jscomp.PureFunctionIdentifier"));
        SimpleDefinitionFinder definitionProvider = ((SimpleDefinitionFinder) createInstance("com.google.javascript.jscomp.SimpleDefinitionFinder"));
        LinkedHashMap definitionSiteMap = new LinkedHashMap();
        setField(definitionProvider, "com.google.javascript.jscomp.SimpleDefinitionFinder", "definitionSiteMap", definitionSiteMap);
        setField(pureFunctionIdentifier, "com.google.javascript.jscomp.PureFunctionIdentifier", "definitionProvider", definitionProvider);
        ArrayList allFunctionCalls = new ArrayList();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        allFunctionCalls.add(node);
        allFunctionCalls.add(null);
        allFunctionCalls.add(null);
        allFunctionCalls.add(null);
        allFunctionCalls.add(null);
        allFunctionCalls.add(null);
        allFunctionCalls.add(null);
        allFunctionCalls.add(null);
        allFunctionCalls.add(null);
        allFunctionCalls.add(null);
        setField(pureFunctionIdentifier, "com.google.javascript.jscomp.PureFunctionIdentifier", "allFunctionCalls", allFunctionCalls);
        
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Method markPureFunctionCallsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("markPureFunctionCalls");
        markPureFunctionCallsMethod.setAccessible(true);
        java.lang.Object[] markPureFunctionCallsMethodArguments = new java.lang.Object[0];
        try {
            markPureFunctionCallsMethod.invoke(pureFunctionIdentifier, markPureFunctionCallsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method markPureFunctionCalls()
    
    @Test
    public void testMarkPureFunctionCalls1() throws Exception  {
        PureFunctionIdentifier pureFunctionIdentifier = ((PureFunctionIdentifier) createInstance("com.google.javascript.jscomp.PureFunctionIdentifier"));
        SimpleDefinitionFinder definitionProvider = ((SimpleDefinitionFinder) createInstance("com.google.javascript.jscomp.SimpleDefinitionFinder"));
        LinkedHashMap definitionSiteMap = new LinkedHashMap();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        DefinitionSite definitionSite = ((DefinitionSite) createInstance("com.google.javascript.jscomp.DefinitionSite"));
        definitionSiteMap.put(node, definitionSite);
        setField(definitionProvider, "com.google.javascript.jscomp.SimpleDefinitionFinder", "definitionSiteMap", definitionSiteMap);
        setField(pureFunctionIdentifier, "com.google.javascript.jscomp.PureFunctionIdentifier", "definitionProvider", definitionProvider);
        ArrayList allFunctionCalls = new ArrayList();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", node);
        allFunctionCalls.add(numberNode);
        setField(pureFunctionIdentifier, "com.google.javascript.jscomp.PureFunctionIdentifier", "allFunctionCalls", allFunctionCalls);
        
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Method markPureFunctionCallsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("markPureFunctionCalls");
        markPureFunctionCallsMethod.setAccessible(true);
        java.lang.Object[] markPureFunctionCallsMethodArguments = new java.lang.Object[0];
        markPureFunctionCallsMethod.invoke(pureFunctionIdentifier, markPureFunctionCallsMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method markPureFunctionCalls()
    
    @Test
    public void testMarkPureFunctionCalls2() throws Throwable  {
        PureFunctionIdentifier pureFunctionIdentifier = ((PureFunctionIdentifier) createInstance("com.google.javascript.jscomp.PureFunctionIdentifier"));
        SimpleDefinitionFinder definitionProvider = ((SimpleDefinitionFinder) createInstance("com.google.javascript.jscomp.SimpleDefinitionFinder"));
        LinkedHashMap definitionSiteMap = new LinkedHashMap();
        DefinitionSite definitionSite = ((DefinitionSite) createInstance("com.google.javascript.jscomp.DefinitionSite"));
        definitionSiteMap.put(null, definitionSite);
        setField(definitionProvider, "com.google.javascript.jscomp.SimpleDefinitionFinder", "definitionSiteMap", definitionSiteMap);
        setField(pureFunctionIdentifier, "com.google.javascript.jscomp.PureFunctionIdentifier", "definitionProvider", definitionProvider);
        ArrayList allFunctionCalls = new ArrayList();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        allFunctionCalls.add(numberNode);
        allFunctionCalls.add(pureFunctionIdentifier);
        allFunctionCalls.add(pureFunctionIdentifier);
        setField(pureFunctionIdentifier, "com.google.javascript.jscomp.PureFunctionIdentifier", "allFunctionCalls", allFunctionCalls);
        
        /* This test fails because method [com.google.javascript.jscomp.PureFunctionIdentifier.markPureFunctionCalls] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.PureFunctionIdentifier cannot be cast to class com.google.javascript.rhino.Node (com.google.javascript.jscomp.PureFunctionIdentifier and com.google.javascript.rhino.Node are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            com.google.javascript.jscomp.PureFunctionIdentifier.markPureFunctionCalls(PureFunctionIdentifier.java:262) */
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Method markPureFunctionCallsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("markPureFunctionCalls");
        markPureFunctionCallsMethod.setAccessible(true);
        java.lang.Object[] markPureFunctionCallsMethodArguments = new java.lang.Object[0];
        try {
            markPureFunctionCallsMethod.invoke(pureFunctionIdentifier, markPureFunctionCallsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testMarkPureFunctionCalls3() throws Throwable  {
        PureFunctionIdentifier pureFunctionIdentifier = ((PureFunctionIdentifier) createInstance("com.google.javascript.jscomp.PureFunctionIdentifier"));
        ArrayList allFunctionCalls = new ArrayList();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        allFunctionCalls.add(stringNode);
        allFunctionCalls.add(null);
        allFunctionCalls.add(null);
        setField(pureFunctionIdentifier, "com.google.javascript.jscomp.PureFunctionIdentifier", "allFunctionCalls", allFunctionCalls);
        
        /* This test fails because method [com.google.javascript.jscomp.PureFunctionIdentifier.markPureFunctionCalls] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PureFunctionIdentifier.markPureFunctionCalls(PureFunctionIdentifier.java:263) */
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Method markPureFunctionCallsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("markPureFunctionCalls");
        markPureFunctionCallsMethod.setAccessible(true);
        java.lang.Object[] markPureFunctionCallsMethodArguments = new java.lang.Object[0];
        try {
            markPureFunctionCallsMethod.invoke(pureFunctionIdentifier, markPureFunctionCallsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testMarkPureFunctionCalls4() throws Throwable  {
        PureFunctionIdentifier pureFunctionIdentifier = ((PureFunctionIdentifier) createInstance("com.google.javascript.jscomp.PureFunctionIdentifier"));
        SimpleDefinitionFinder definitionProvider = ((SimpleDefinitionFinder) createInstance("com.google.javascript.jscomp.SimpleDefinitionFinder"));
        LinkedHashMap definitionSiteMap = new LinkedHashMap();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        DefinitionSite definitionSite = ((DefinitionSite) createInstance("com.google.javascript.jscomp.DefinitionSite"));
        definitionSiteMap.put(node, definitionSite);
        setField(definitionProvider, "com.google.javascript.jscomp.SimpleDefinitionFinder", "definitionSiteMap", definitionSiteMap);
        setField(pureFunctionIdentifier, "com.google.javascript.jscomp.PureFunctionIdentifier", "definitionProvider", definitionProvider);
        ArrayList allFunctionCalls = new ArrayList();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", node);
        allFunctionCalls.add(functionNode);
        allFunctionCalls.add(null);
        allFunctionCalls.add(null);
        setField(pureFunctionIdentifier, "com.google.javascript.jscomp.PureFunctionIdentifier", "allFunctionCalls", allFunctionCalls);
        
        /* This test fails because method [com.google.javascript.jscomp.PureFunctionIdentifier.markPureFunctionCalls] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PureFunctionIdentifier.markPureFunctionCalls(PureFunctionIdentifier.java:263) */
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Method markPureFunctionCallsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("markPureFunctionCalls");
        markPureFunctionCallsMethod.setAccessible(true);
        java.lang.Object[] markPureFunctionCallsMethodArguments = new java.lang.Object[0];
        try {
            markPureFunctionCallsMethod.invoke(pureFunctionIdentifier, markPureFunctionCallsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testMarkPureFunctionCalls5() throws Throwable  {
        PureFunctionIdentifier pureFunctionIdentifier = ((PureFunctionIdentifier) createInstance("com.google.javascript.jscomp.PureFunctionIdentifier"));
        SimpleDefinitionFinder definitionProvider = ((SimpleDefinitionFinder) createInstance("com.google.javascript.jscomp.SimpleDefinitionFinder"));
        LinkedHashMap definitionSiteMap = new LinkedHashMap();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        DefinitionSite definitionSite = ((DefinitionSite) createInstance("com.google.javascript.jscomp.DefinitionSite"));
        definitionSiteMap.put(numberNode, definitionSite);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        definitionSiteMap.put(numberNode1, definitionSite);
        setField(definitionProvider, "com.google.javascript.jscomp.SimpleDefinitionFinder", "definitionSiteMap", definitionSiteMap);
        setField(pureFunctionIdentifier, "com.google.javascript.jscomp.PureFunctionIdentifier", "definitionProvider", definitionProvider);
        ArrayList allFunctionCalls = new ArrayList();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        allFunctionCalls.add(stringNode);
        allFunctionCalls.add(definitionSite);
        allFunctionCalls.add(null);
        setField(pureFunctionIdentifier, "com.google.javascript.jscomp.PureFunctionIdentifier", "allFunctionCalls", allFunctionCalls);
        
        /* This test fails because method [com.google.javascript.jscomp.PureFunctionIdentifier.markPureFunctionCalls] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SimpleDefinitionFinder.getDefinitionsReferencedAt(SimpleDefinitionFinder.java:74)
            com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions(PureFunctionIdentifier.java:183)
            com.google.javascript.jscomp.PureFunctionIdentifier.markPureFunctionCalls(PureFunctionIdentifier.java:265) */
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Method markPureFunctionCallsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("markPureFunctionCalls");
        markPureFunctionCallsMethod.setAccessible(true);
        java.lang.Object[] markPureFunctionCallsMethodArguments = new java.lang.Object[0];
        try {
            markPureFunctionCallsMethod.invoke(pureFunctionIdentifier, markPureFunctionCallsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testMarkPureFunctionCalls6() throws Throwable  {
        PureFunctionIdentifier pureFunctionIdentifier = ((PureFunctionIdentifier) createInstance("com.google.javascript.jscomp.PureFunctionIdentifier"));
        SimpleDefinitionFinder definitionProvider = ((SimpleDefinitionFinder) createInstance("com.google.javascript.jscomp.SimpleDefinitionFinder"));
        LinkedHashMap definitionSiteMap = new LinkedHashMap();
        setField(definitionProvider, "com.google.javascript.jscomp.SimpleDefinitionFinder", "definitionSiteMap", definitionSiteMap);
        setField(pureFunctionIdentifier, "com.google.javascript.jscomp.PureFunctionIdentifier", "definitionProvider", definitionProvider);
        ArrayList allFunctionCalls = new ArrayList();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000\u0000\u0000\u0000\u0000";
        setField(last, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        allFunctionCalls.add(node);
        allFunctionCalls.add(null);
        allFunctionCalls.add(null);
        setField(pureFunctionIdentifier, "com.google.javascript.jscomp.PureFunctionIdentifier", "allFunctionCalls", allFunctionCalls);
        
        /* This test fails because method [com.google.javascript.jscomp.PureFunctionIdentifier.markPureFunctionCalls] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SimpleDefinitionFinder.getDefinitionsReferencedAt(SimpleDefinitionFinder.java:82)
            com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions(PureFunctionIdentifier.java:183)
            com.google.javascript.jscomp.PureFunctionIdentifier.markPureFunctionCalls(PureFunctionIdentifier.java:265) */
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Method markPureFunctionCallsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("markPureFunctionCalls");
        markPureFunctionCallsMethod.setAccessible(true);
        java.lang.Object[] markPureFunctionCallsMethodArguments = new java.lang.Object[0];
        try {
            markPureFunctionCallsMethod.invoke(pureFunctionIdentifier, markPureFunctionCallsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method markPureFunctionCalls()
    
    @Test(expected = UnsupportedOperationException.class)
    public void testMarkPureFunctionCalls7() throws Throwable  {
        PureFunctionIdentifier pureFunctionIdentifier = ((PureFunctionIdentifier) createInstance("com.google.javascript.jscomp.PureFunctionIdentifier"));
        SimpleDefinitionFinder definitionProvider = ((SimpleDefinitionFinder) createInstance("com.google.javascript.jscomp.SimpleDefinitionFinder"));
        LinkedHashMap definitionSiteMap = new LinkedHashMap();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        DefinitionSite definitionSite = ((DefinitionSite) createInstance("com.google.javascript.jscomp.DefinitionSite"));
        definitionSiteMap.put(numberNode, definitionSite);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        definitionSiteMap.put(numberNode1, definitionSite);
        setField(definitionProvider, "com.google.javascript.jscomp.SimpleDefinitionFinder", "definitionSiteMap", definitionSiteMap);
        setField(pureFunctionIdentifier, "com.google.javascript.jscomp.PureFunctionIdentifier", "definitionProvider", definitionProvider);
        ArrayList allFunctionCalls = new ArrayList();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        allFunctionCalls.add(stringNode);
        allFunctionCalls.add(definitionSite);
        allFunctionCalls.add(null);
        setField(pureFunctionIdentifier, "com.google.javascript.jscomp.PureFunctionIdentifier", "allFunctionCalls", allFunctionCalls);
        
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Method markPureFunctionCallsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("markPureFunctionCalls");
        markPureFunctionCallsMethod.setAccessible(true);
        java.lang.Object[] markPureFunctionCallsMethodArguments = new java.lang.Object[0];
        try {
            markPureFunctionCallsMethod.invoke(pureFunctionIdentifier, markPureFunctionCallsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testMarkPureFunctionCalls8() throws Throwable  {
        PureFunctionIdentifier pureFunctionIdentifier = ((PureFunctionIdentifier) createInstance("com.google.javascript.jscomp.PureFunctionIdentifier"));
        SimpleDefinitionFinder definitionProvider = ((SimpleDefinitionFinder) createInstance("com.google.javascript.jscomp.SimpleDefinitionFinder"));
        LinkedHashMap definitionSiteMap = new LinkedHashMap();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        DefinitionSite definitionSite = ((DefinitionSite) createInstance("com.google.javascript.jscomp.DefinitionSite"));
        definitionSiteMap.put(node, definitionSite);
        setField(definitionProvider, "com.google.javascript.jscomp.SimpleDefinitionFinder", "definitionSiteMap", definitionSiteMap);
        setField(pureFunctionIdentifier, "com.google.javascript.jscomp.PureFunctionIdentifier", "definitionProvider", definitionProvider);
        ArrayList allFunctionCalls = new ArrayList();
        Node node1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(node1, "com.google.javascript.rhino.Node", "first", first);
        allFunctionCalls.add(node1);
        allFunctionCalls.add(null);
        allFunctionCalls.add(null);
        setField(pureFunctionIdentifier, "com.google.javascript.jscomp.PureFunctionIdentifier", "allFunctionCalls", allFunctionCalls);
        
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Method markPureFunctionCallsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("markPureFunctionCalls");
        markPureFunctionCallsMethod.setAccessible(true);
        java.lang.Object[] markPureFunctionCallsMethodArguments = new java.lang.Object[0];
        try {
            markPureFunctionCallsMethod.invoke(pureFunctionIdentifier, markPureFunctionCallsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testMarkPureFunctionCalls9() throws Throwable  {
        PureFunctionIdentifier pureFunctionIdentifier = ((PureFunctionIdentifier) createInstance("com.google.javascript.jscomp.PureFunctionIdentifier"));
        SimpleDefinitionFinder definitionProvider = ((SimpleDefinitionFinder) createInstance("com.google.javascript.jscomp.SimpleDefinitionFinder"));
        LinkedHashMap definitionSiteMap = new LinkedHashMap();
        DefinitionSite definitionSite = ((DefinitionSite) createInstance("com.google.javascript.jscomp.DefinitionSite"));
        definitionSiteMap.put(null, definitionSite);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        definitionSiteMap.put(node, definitionSite);
        setField(definitionProvider, "com.google.javascript.jscomp.SimpleDefinitionFinder", "definitionSiteMap", definitionSiteMap);
        setField(pureFunctionIdentifier, "com.google.javascript.jscomp.PureFunctionIdentifier", "definitionProvider", definitionProvider);
        ArrayList allFunctionCalls = new ArrayList();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(38);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        allFunctionCalls.add(functionNode);
        allFunctionCalls.add(definitionSite);
        allFunctionCalls.add(null);
        setField(pureFunctionIdentifier, "com.google.javascript.jscomp.PureFunctionIdentifier", "allFunctionCalls", allFunctionCalls);
        
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Method markPureFunctionCallsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("markPureFunctionCalls");
        markPureFunctionCallsMethod.setAccessible(true);
        java.lang.Object[] markPureFunctionCallsMethodArguments = new java.lang.Object[0];
        try {
            markPureFunctionCallsMethod.invoke(pureFunctionIdentifier, markPureFunctionCallsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PureFunctionIdentifier.propagateSideEffects
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method propagateSideEffects()
    
    /**
    @utbot.classUnderTest {@link PureFunctionIdentifier}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier#propagateSideEffects()}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(FunctionInformation functionInfo: functionSideEffectMap.values())
 *  */
    @Test
    public void testPropagateSideEffects_ThrowNullPointerException() throws Throwable  {
        PureFunctionIdentifier pureFunctionIdentifier = ((PureFunctionIdentifier) createInstance("com.google.javascript.jscomp.PureFunctionIdentifier"));
        
        /* This test fails because method [com.google.javascript.jscomp.PureFunctionIdentifier.propagateSideEffects] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PureFunctionIdentifier.propagateSideEffects(PureFunctionIdentifier.java:212) */
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Method propagateSideEffectsMethod = pureFunctionIdentifierClazz.getDeclaredMethod("propagateSideEffects");
        propagateSideEffectsMethod.setAccessible(true);
        java.lang.Object[] propagateSideEffectsMethodArguments = new java.lang.Object[0];
        try {
            propagateSideEffectsMethod.invoke(pureFunctionIdentifier, propagateSideEffectsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PureFunctionIdentifier.getDebugReport
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getDebugReport()
    
    /**
    @utbot.classUnderTest {@link PureFunctionIdentifier}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier#getDebugReport()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkNotNull(externs);
 *  */
    @Test(expected = NullPointerException.class)
    public void testGetDebugReport_ThrowNullPointerException() throws Exception  {
        PureFunctionIdentifier pureFunctionIdentifier = ((PureFunctionIdentifier) createInstance("com.google.javascript.jscomp.PureFunctionIdentifier"));
        
        pureFunctionIdentifier.getDebugReport();
    }
    
    /**
    @utbot.classUnderTest {@link PureFunctionIdentifier}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier#getDebugReport()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkNotNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkNotNull(root);
 *  */
    @Test(expected = NullPointerException.class)
    public void testGetDebugReport_ThrowNullPointerException_1() throws Exception  {
        PureFunctionIdentifier pureFunctionIdentifier = ((PureFunctionIdentifier) createInstance("com.google.javascript.jscomp.PureFunctionIdentifier"));
        FunctionNode externs = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(pureFunctionIdentifier, "com.google.javascript.jscomp.PureFunctionIdentifier", "externs", externs);
        
        pureFunctionIdentifier.getDebugReport();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDebugReport()
    
    /**
    @utbot.classUnderTest {@link PureFunctionIdentifier}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier#getDebugReport()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: functionNames.process(null, externs);
 *  */
    @Test
    public void testGetDebugReport_ThrowNullPointerException_2() throws Exception  {
        PureFunctionIdentifier pureFunctionIdentifier = ((PureFunctionIdentifier) createInstance("com.google.javascript.jscomp.PureFunctionIdentifier"));
        FunctionNode externs = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        externs.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        int[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(externs, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(pureFunctionIdentifier, "com.google.javascript.jscomp.PureFunctionIdentifier", "externs", externs);
        ScriptOrFnNode root = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(pureFunctionIdentifier, "com.google.javascript.jscomp.PureFunctionIdentifier", "root", root);
        
        /* This test fails because method [com.google.javascript.jscomp.PureFunctionIdentifier.getDebugReport] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.FunctionNames.process(FunctionNames.java:64)
            com.google.javascript.jscomp.PureFunctionIdentifier.getDebugReport(PureFunctionIdentifier.java:117) */
        pureFunctionIdentifier.getDebugReport();
    }
    
    /**
    @utbot.classUnderTest {@link PureFunctionIdentifier}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier#getDebugReport()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: functionNames.process(null, externs);
 *  */
    @Test
    public void testGetDebugReport_ThrowNullPointerException_3() throws Exception  {
        PureFunctionIdentifier pureFunctionIdentifier = ((PureFunctionIdentifier) createInstance("com.google.javascript.jscomp.PureFunctionIdentifier"));
        ScriptOrFnNode externs = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        externs.setType(120);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(externs, "com.google.javascript.rhino.Node", "first", first);
        setField(pureFunctionIdentifier, "com.google.javascript.jscomp.PureFunctionIdentifier", "externs", externs);
        FunctionNode root = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(pureFunctionIdentifier, "com.google.javascript.jscomp.PureFunctionIdentifier", "root", root);
        
        /* This test fails because method [com.google.javascript.jscomp.PureFunctionIdentifier.getDebugReport] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.FunctionNames.process(FunctionNames.java:64)
            com.google.javascript.jscomp.PureFunctionIdentifier.getDebugReport(PureFunctionIdentifier.java:117) */
        pureFunctionIdentifier.getDebugReport();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PureFunctionIdentifier.getCallThisObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCallThisObject(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PureFunctionIdentifier}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier#getCallThisObject(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!NodeUtil.isGetProp(foo)): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetCallThisObject_NotNodeUtilIsGetProp() throws Exception  {
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCallThisObjectMethod = pureFunctionIdentifierClazz.getDeclaredMethod("getCallThisObject", functionNodeType);
        getCallThisObjectMethod.setAccessible(true);
        java.lang.Object[] getCallThisObjectMethodArguments = new java.lang.Object[1];
        getCallThisObjectMethodArguments[0] = functionNode;
        Node actual = ((Node) getCallThisObjectMethod.invoke(null, getCallThisObjectMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PureFunctionIdentifier}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier#getCallThisObject(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!NodeUtil.isGetProp(foo)): False}
 * @utbot.executesCondition {@code (propString.equals("call") || propString.equals("apply")): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.returnsFrom {@code return foo.getNext();}
 *  */
    @Test
    public void testGetCallThisObject_PropStringEqualsOrPropStringEquals() throws Exception  {
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(last, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCallThisObjectMethod = pureFunctionIdentifierClazz.getDeclaredMethod("getCallThisObject", scriptOrFnNodeType);
        getCallThisObjectMethod.setAccessible(true);
        java.lang.Object[] getCallThisObjectMethodArguments = new java.lang.Object[1];
        getCallThisObjectMethodArguments[0] = scriptOrFnNode;
        Node actual = ((Node) getCallThisObjectMethod.invoke(null, getCallThisObjectMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCallThisObject(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PureFunctionIdentifier}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier#getCallThisObject(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node foo = callSite.getFirstChild();
 *  */
    @Test
    public void testGetCallThisObject_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.javascript.jscomp.PureFunctionIdentifier.getCallThisObject] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PureFunctionIdentifier.getCallThisObject(PureFunctionIdentifier.java:518) */
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCallThisObjectMethod = pureFunctionIdentifierClazz.getDeclaredMethod("getCallThisObject", nodeType);
        getCallThisObjectMethod.setAccessible(true);
        java.lang.Object[] getCallThisObjectMethodArguments = new java.lang.Object[1];
        getCallThisObjectMethodArguments[0] = ((Object) null);
        try {
            getCallThisObjectMethod.invoke(null, getCallThisObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PureFunctionIdentifier}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier#getCallThisObject(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!NodeUtil.isGetProp(foo)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String propString = foo.getLastChild().getString();
 *  */
    @Test
    public void testGetCallThisObject_ThrowNullPointerException_1() throws Throwable  {
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PureFunctionIdentifier.getCallThisObject] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PureFunctionIdentifier.getCallThisObject(PureFunctionIdentifier.java:527) */
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCallThisObjectMethod = pureFunctionIdentifierClazz.getDeclaredMethod("getCallThisObject", functionNodeType);
        getCallThisObjectMethod.setAccessible(true);
        java.lang.Object[] getCallThisObjectMethodArguments = new java.lang.Object[1];
        getCallThisObjectMethodArguments[0] = functionNode;
        try {
            getCallThisObjectMethod.invoke(null, getCallThisObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PureFunctionIdentifier}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier#getCallThisObject(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!NodeUtil.isGetProp(foo)): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: propString.equals("call") || propString.equals("apply")
 *  */
    @Test
    public void testGetCallThisObject_ThrowNullPointerException_2() throws Throwable  {
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PureFunctionIdentifier.getCallThisObject] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PureFunctionIdentifier.getCallThisObject(PureFunctionIdentifier.java:528) */
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCallThisObjectMethod = pureFunctionIdentifierClazz.getDeclaredMethod("getCallThisObject", functionNodeType);
        getCallThisObjectMethod.setAccessible(true);
        java.lang.Object[] getCallThisObjectMethodArguments = new java.lang.Object[1];
        getCallThisObjectMethodArguments[0] = functionNode;
        try {
            getCallThisObjectMethod.invoke(null, getCallThisObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getCallThisObject(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PureFunctionIdentifier}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier#getCallThisObject(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String propString = foo.getLastChild().getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetCallThisObject_ThrowIllegalStateException() throws Throwable  {
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCallThisObjectMethod = pureFunctionIdentifierClazz.getDeclaredMethod("getCallThisObject", functionNodeType);
        getCallThisObjectMethod.setAccessible(true);
        java.lang.Object[] getCallThisObjectMethodArguments = new java.lang.Object[1];
        getCallThisObjectMethodArguments[0] = functionNode;
        try {
            getCallThisObjectMethod.invoke(null, getCallThisObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PureFunctionIdentifier}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier#getCallThisObject(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String propString = foo.getLastChild().getString();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetCallThisObject_ThrowUnsupportedOperationException() throws Throwable  {
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCallThisObjectMethod = pureFunctionIdentifierClazz.getDeclaredMethod("getCallThisObject", functionNodeType);
        getCallThisObjectMethod.setAccessible(true);
        java.lang.Object[] getCallThisObjectMethodArguments = new java.lang.Object[1];
        getCallThisObjectMethodArguments[0] = functionNode;
        try {
            getCallThisObjectMethod.invoke(null, getCallThisObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getCallThisObject(com.google.javascript.rhino.Node)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PureFunctionIdentifier#getCallThisObject(com.google.javascript.rhino.Node)}
     */
    @Test
    public void testGetCallThisObjectThrowsNPE() throws Throwable  {
        Node node = new Node(1, -1, -1);
        node.setType(-2147221504);
        
        /* This test fails because method [com.google.javascript.jscomp.PureFunctionIdentifier.getCallThisObject] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isGetProp(NodeUtil.java:805)
            com.google.javascript.jscomp.PureFunctionIdentifier.getCallThisObject(PureFunctionIdentifier.java:519) */
        Class pureFunctionIdentifierClazz = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCallThisObjectMethod = pureFunctionIdentifierClazz.getDeclaredMethod("getCallThisObject", nodeType);
        getCallThisObjectMethod.setAccessible(true);
        java.lang.Object[] getCallThisObjectMethodArguments = new java.lang.Object[1];
        getCallThisObjectMethodArguments[0] = node;
        try {
            getCallThisObjectMethod.invoke(null, getCallThisObjectMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields910610469884600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields910610469884600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass910610469898200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields910610469884600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass910610469898200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields910610470483400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields910610470483400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass910610470489100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields910610470483400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass910610470489100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

